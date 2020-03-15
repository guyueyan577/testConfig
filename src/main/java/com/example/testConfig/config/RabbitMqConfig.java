package com.example.testConfig.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.RabbitListenerContainerFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.JSONObject;
import com.example.testConfig.configModel.RabbitMqModel;
import com.example.testConfig.utils.HttpRequest;

/**
 * RabbitMq配置文件读取类
 **/
@Configuration
@EnableRabbit
public class RabbitMqConfig {    

	@Value("${config.url}")
	String configUrl;
	
	RabbitMqModel rabbitMqModel = null;
	
	private void getRabbitMqModel() {
    	//只需要读取一次配置信息
    	if (rabbitMqModel == null) {
	        String strRabbitMqConfig = HttpRequest.sendGet(configUrl + "/rabbitmq", "");
	        
	        if (StringUtils.isNotBlank(strRabbitMqConfig)){		        	
	        	rabbitMqModel = JSONObject.parseObject(strRabbitMqConfig,RabbitMqModel.class);
	        }
    	}
	}
	
    // 构建mq实例工厂
    @Bean
    public ConnectionFactory connectionFactory(){
    	
    	getRabbitMqModel();
    	CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
    	if (rabbitMqModel != null) {
	        connectionFactory.setAddresses(rabbitMqModel.getAddresses());
	        connectionFactory.setUsername(rabbitMqModel.getUsername());
	        connectionFactory.setPassword(rabbitMqModel.getPassword());
	        connectionFactory.setPublisherConfirms(true);
	        connectionFactory.setVirtualHost(rabbitMqModel.getVirtualHost());
    	}
        return connectionFactory;
    }

    @Bean("rabbitAdmin")
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory){
        return new RabbitAdmin(connectionFactory);
    }

    @Bean("rabbitTemplate")
    public RabbitTemplate rabbitTemplate(){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        return rabbitTemplate;
    }
    
    @Bean
	public RabbitListenerContainerFactory<?> rabbitListenerContainerFactory(ConnectionFactory connectionFactory){
	    SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
	    factory.setConnectionFactory(connectionFactory);
	    factory.setMessageConverter(new Jackson2JsonMessageConverter());
	    factory.setAcknowledgeMode(AcknowledgeMode.MANUAL);             
	    return factory;
	}
}
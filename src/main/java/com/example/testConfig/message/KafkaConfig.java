package com.example.testConfig.message;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.AbstractMessageListenerContainer;

import com.alibaba.fastjson.JSONObject;
import com.example.testConfig.configModel.KafakaConfigModel;
import com.example.testConfig.utils.HttpRequest;

@Configuration
@EnableKafka
public class KafkaConfig {
	@Value("${spring.application.name}")
	String applicationName;
	
	private KafakaConfigModel kafakaConfigModel = null;
	Map<String, Object> props = null;
    
	/**
	 * @Description: 读取kafka配置信息
	 * @author: 陈建伟
	 * @date: 2020-03-15
	 * @return
	 * @throws
	 */
    private Map<String, Object> getKafkaConfigInfo() {
    	if (props == null) {
    		props = new HashMap<>();    	
	        String strKafkaConfig = HttpRequest.sendGet("http://127.0.0.1:8080/kafka", "");        
	        if (StringUtils.isNotBlank(strKafkaConfig)){        	
	        	kafakaConfigModel = JSONObject.parseObject(strKafkaConfig,KafakaConfigModel.class);	        	
	        	props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafakaConfigModel.getServers());
	            props.put(ProducerConfig.RETRIES_CONFIG, kafakaConfigModel.getRetries());
	            props.put(ProducerConfig.BATCH_SIZE_CONFIG, kafakaConfigModel.getBatchSize());
	            props.put(ProducerConfig.LINGER_MS_CONFIG, kafakaConfigModel.getLinger());
	            props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, kafakaConfigModel.getBufferMemory());
	            props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
	            props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
	        }
        }        
        return props;
    }
    
    /**
     * @Description: 构造生成者Fanctory
     * @author: 陈建伟
     * @date: 2020-03-15
     * @return
     * @throws
     */
    public ProducerFactory<String, String> producerFactory() {
        return new DefaultKafkaProducerFactory<>(getKafkaConfigInfo());
    }
    /**
     * @Description: 生产者的bean
     * @author: 陈建伟
     * @date: 2020-03-15
     * @return
     * @throws
     */
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<String, String>(producerFactory());
    }
    
    /**
     * @Description: 消费者配置信息 
     * @author: 陈建伟
     * @date: 2020-03-15
     * @return
     * @throws
     */
    @Bean
    public Map<String, Object> consumerConfigs() {
    	Map<String, Object> consumerFactorConfig = getKafkaConfigInfo();
    	consumerFactorConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    	consumerFactorConfig.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    	consumerFactorConfig.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
    	consumerFactorConfig.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
    	consumerFactorConfig.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "15000");
    	consumerFactorConfig.put(ConsumerConfig.GROUP_ID_CONFIG, applicationName);
    	consumerFactorConfig.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
    	consumerFactorConfig.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 50);
        return consumerFactorConfig;
    }
    
    /**
     * @Description: 消费者的普通Factory， 直接订阅信息时使用 
     * @author: 陈建伟
     * @date: 2020-03-15
     * @return
     * @throws
     */
    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }    
    
    /**
     * @Description: 消费者定制化的Factory, 用于批量获取消息
     * @author: 陈建伟
     * @date: 2020-03-15
     * @return
     * @throws
     */
    @Bean
    KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setConcurrency(10);
        factory.setBatchListener(true);
        factory.getContainerProperties().setPollTimeout(3000);
        factory.getContainerProperties().setAckMode(AbstractMessageListenerContainer.AckMode.MANUAL_IMMEDIATE);
        return factory;
    }

}

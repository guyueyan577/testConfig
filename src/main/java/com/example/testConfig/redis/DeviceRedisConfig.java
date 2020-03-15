package com.example.testConfig.redis;

import com.alibaba.fastjson.JSONObject;
import com.example.testConfig.configModel.RedisConfigModel;
import com.example.testConfig.utils.HttpRequest;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * *@Description:redis配置类 
 * @author: chenjianwei
 * @date:   2020年3月13日 下午2:23:35
 */
@Configuration
@AutoConfigureAfter(RedisAutoConfiguration.class)
@Slf4j
public class DeviceRedisConfig extends CachingConfigurerSupport {

    private RedisConfigModel redisConfigModel = null;
    private Collection<String> redisNodeCollect = null;
    
    private void getRedisConfigInfo() {
        String strRedisConfig = HttpRequest.sendGet("http://127.0.0.1:8080/redis", "");
        
        if (StringUtils.isNotBlank(strRedisConfig)){
        	
            redisConfigModel = JSONObject.parseObject(strRedisConfig,RedisConfigModel.class);
            
            String strRedisNodes = redisConfigModel.getNodes();
            String[] nodes = strRedisNodes.split(",");
            if (nodes.length > 1){            	
               redisNodeCollect = new ArrayList<>();
               for(String node : nodes) {
            	   redisNodeCollect.add(node);
               }
            }
            log.info(JSONObject.toJSONString(redisConfigModel));
        }
    }

    public DeviceRedisConfig(){
        getRedisConfigInfo();
    }
    /**
     * 使用集群方式连接，如果集群有密码，则加入密码。
     * 另外，集群的其它设置，也可以在此处手动设置。
     * @return
     */
    @Bean(value = "deviceClusterRedisConnectionFactory")
    public LettuceConnectionFactory connectionFactory() {
        
    	LettuceConnectionFactory factory = null;
        GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();
        genericObjectPoolConfig.setMaxIdle(redisConfigModel.getMaxIdle());
        genericObjectPoolConfig.setMinIdle(redisConfigModel.getMinIdledle());
        genericObjectPoolConfig.setMaxTotal(redisConfigModel.getMaxActive());
        genericObjectPoolConfig.setMaxWaitMillis(redisConfigModel.getMaxWait());
        LettucePoolingClientConfiguration lettuceClientConfiguration = LettucePoolingClientConfiguration.builder()
                .poolConfig(genericObjectPoolConfig).build();

        if (redisNodeCollect != null) {
	        //集群Reids配置
	        RedisClusterConfiguration redisClusterConfiguration = new RedisClusterConfiguration(redisNodeCollect);
	        if (StringUtils.isNotBlank(redisConfigModel.getPassword())){
	        	RedisPassword redisPassword = RedisPassword.of(redisConfigModel.getPassword());
	        	redisClusterConfiguration.setPassword(redisPassword);
	        }
	        factory = new LettuceConnectionFactory(redisClusterConfiguration, lettuceClientConfiguration);
        } else {
	        // 单机redis
        	String[] redisInfo = redisConfigModel.getNodes().split(":");
	 		String hostName = redisInfo[0];
	 		Integer port = redisInfo.length ==2 ? Integer.valueOf(redisInfo[1]):6379;

	 		RedisStandaloneConfiguration redisStandaloneConfiguration =
	 				new RedisStandaloneConfiguration();
	 		redisStandaloneConfiguration.setHostName(hostName);
	 		redisStandaloneConfiguration.setDatabase(redisConfigModel.getDatabase());
	 		redisStandaloneConfiguration.setPassword(RedisPassword.of(redisConfigModel.getPassword()));
	 		redisStandaloneConfiguration.setPort(port);
	 		factory = new LettuceConnectionFactory(redisStandaloneConfiguration, lettuceClientConfiguration);
        }
        return factory;
    }

    // 以下两种redisTemplate自由根据场景选择

    /**
     * Key 与 Value 都为String类型
     * 主要用于存储Json、纯String 类型的数据
     * @param factory  连接工厂
     * @return  String-focused extension of RedisTemplate
     */
    
    @Bean(name = "deviceStringRedisTemplate")
    public StringRedisTemplate deviceStringRedisTemplate(@Qualifier(value = "deviceClusterRedisConnectionFactory") LettuceConnectionFactory factory) {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(factory);
        return stringRedisTemplate;
    }

    /**
     * Key为String Value为任意值
     * 主要应用在Hash格式的缓存
     * @param factory 连接工厂
     * @return org.springframework.data.redis.core.RedisTemplate
     */
    @Bean(name = "deviceRedisTemplate")
    public RedisTemplate<String, Object> deviceRedisTemplate(@Qualifier(value = "deviceClusterRedisConnectionFactory") LettuceConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(factory);
        
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        
        template.setKeySerializer(jackson2JsonRedisSerializer);
        template.setValueSerializer(jackson2JsonRedisSerializer);
        template.setHashKeySerializer(jackson2JsonRedisSerializer);
        template.setHashValueSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }
}

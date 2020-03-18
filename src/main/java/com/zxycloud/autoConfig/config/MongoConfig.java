package com.zxycloud.autoConfig.config;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.alibaba.fastjson.JSONObject;
import com.zxycloud.autoConfig.configModel.MongoConfigModel;
import com.zxycloud.autoConfig.utils.HttpRequest;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
public class MongoConfig {
	@Value("${spring.application.name}")
	String applicationName;
	@Value("${config.url}")
	String configUrl;
	
	MongoConfigModel mongoConfigModel = null;
	
	public MongoConfigModel getMonoInfo() {
		return mongoConfigModel;
	}
	
	private void getMongoConfigModel() {
		//只读取一次配置信息
		if (mongoConfigModel == null) {
			String strMongoConfigModel = HttpRequest.sendGet(configUrl + "/mongodb", "");        
	        if (StringUtils.isNotBlank(strMongoConfigModel)){        	
	        	mongoConfigModel = JSONObject.parseObject(strMongoConfigModel, MongoConfigModel.class);	
	        }
		}
	}
	
    //覆盖默认的MongoDbFacotry
    @Bean
    @Autowired
    public MongoDbFactory mongoDbFactory() {
    	
    	getMongoConfigModel();
    	
        //客户端配置（连接数，副本集群验证）
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        builder.connectionsPerHost(mongoConfigModel.getMaxConnectionsPerHost());
        builder.minConnectionsPerHost(mongoConfigModel.getMinConnectionsPerHost());
                    
        builder.threadsAllowedToBlockForConnectionMultiplier(
                mongoConfigModel.getThreadsAllowedToBlockForConnectionMultiplier());
        builder.serverSelectionTimeout(mongoConfigModel.getServerSelectionTimeout());
        builder.maxWaitTime(mongoConfigModel.getMaxWaitTime());
        builder.maxConnectionIdleTime(mongoConfigModel.getMaxConnectionIdleTime());
        builder.maxConnectionLifeTime(mongoConfigModel.getMaxConnectionLifeTime());
        builder.connectTimeout(mongoConfigModel.getConnectTimeout());
        builder.socketTimeout(mongoConfigModel.getSocketTimeout());
        builder.heartbeatFrequency(mongoConfigModel.getHeartbeatFrequency());
        builder.minHeartbeatFrequency(mongoConfigModel.getMinHeartbeatFrequency());
        builder.heartbeatConnectTimeout(mongoConfigModel.getHeartbeatConnectTimeout());
        builder.heartbeatSocketTimeout(mongoConfigModel.getHeartbeatSocketTimeout());
        
        MongoClientOptions mongoClientOptions = builder.build();

        // MongoDB地址列表
        List<ServerAddress> serverAddresses = new ArrayList<>();
        String strMongoAddress = mongoConfigModel.getAddress();
        String[] mongoAddressArray = strMongoAddress.split(",");
        for (String address : mongoAddressArray) {
            String[] hostAndPort = address.split(":");
            
            String host = hostAndPort[0];
            Integer port = 27017;
            if (hostAndPort.length == 2) {
	            port = Integer.parseInt(hostAndPort[1]);
            }

            ServerAddress serverAddress = new ServerAddress(host, port);
            serverAddresses.add(serverAddress);
        }
        
        // 连接认证
        MongoCredential mongoCredential = MongoCredential.createScramSha1Credential(mongoConfigModel.getUsername(),
                StringUtils.isBlank(mongoConfigModel.getAuthenticationDatabase())?"admin":mongoConfigModel.getAuthenticationDatabase(),
                mongoConfigModel.getPassword().toCharArray());

        //创建客户端和Factory
        MongoClient mongoClient = new MongoClient(serverAddresses, mongoCredential, mongoClientOptions);
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClient, mongoConfigModel.getDatabase());
        
        return mongoDbFactory;
    }
}
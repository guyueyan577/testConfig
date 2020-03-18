package com.zxycloud.autoConfig.configModel;

import lombok.Data;

@Data
public class MysqlConfigModel {
	/**
	 * 1写3读数据库地址，格式：jdbc:mysql://192.168.32.140:3306
	 */
	String writeDbUrl;
	String read1Dburl;
	String read2Dburl;
	String read3Dburl;
	
	Integer maxWait;
	Integer maxActive;
	Integer removeAbandonedTimeout;
	Integer minEvictableIdleTimeMillis;
	Integer maxEvictableIdleTimeMillis;
	Integer minIdle;
	Integer initialSize;
	Integer betweenEvictionRunsMillis;
	Integer connectionErrorRetryAttempts;
	Integer phyTimeoutMillis;
    String driverClassName;
    String dataSourceType;
    
	String userName;
	String password;
	String configInfo;
}

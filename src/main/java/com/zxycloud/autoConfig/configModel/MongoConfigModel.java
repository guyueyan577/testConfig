package com.zxycloud.autoConfig.configModel;

import lombok.Data;

@Data
public class MongoConfigModel {
	/**
	 * 库（文档）
	 */
    private String database;
    /**
     * 集群地址，格式：ip:port,ip:port
     */
    private String address; 
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 认证库名称
     */
    private String authenticationDatabase;
    /**
     * 每个主机的最小连接数
     */
    private Integer minConnectionsPerHost;
    /**
     * 每个主机的最大连接数
     */
    private Integer maxConnectionsPerHost;
    /**
     * 允许阻塞等待连接的线程数量的倍数
     */
    private Integer threadsAllowedToBlockForConnectionMultiplier;
    /**
     * 服务器选择超时以毫秒为间隔，这定义了在抛出异常之前，驱动程序等待服务器选择成功的时间。
     */
    private Integer serverSelectionTimeout;
    /**
     * 最长时间，线程阻塞等待连接
     */
    private Integer maxWaitTime;
    /**
     * 连接池连接的最大空闲时间
     */
    private Integer maxConnectionIdleTime;
    /**
     * 连接池连接的最大生命时间
     */
    private Integer maxConnectionLifeTime;
    /**
     * 连接超时时间
     */
    private Integer connectTimeout;
    /**
     * 套接字超时时间
     */
    private Integer socketTimeout;   
    /**
     * 心跳频率
     */
    private Integer heartbeatFrequency;
    /**
     * 最小的心跳频率
     */
    private Integer minHeartbeatFrequency;
    /**
     * 集群心跳的连接设置连接超时时间
     */
    private Integer heartbeatConnectTimeout;
    /**
     * 集群心跳的连接设置套接字超时时间
     */
    private Integer heartbeatSocketTimeout;     
}

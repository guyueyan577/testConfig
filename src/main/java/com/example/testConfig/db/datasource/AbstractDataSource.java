package com.example.testConfig.db.datasource;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

import lombok.Data;

@Data
public class AbstractDataSource {
    private Long maxTimeOut;
    private Integer removeAbandonedTimeout;
    private Long minEvictableIdleTimeMillis;
    private Long maxEvictableIdleTimeMillis;
    private Integer minIdle;
    private Integer initialSize;
    private Long betweenEvictionRunsMillis;
    private Integer connectionErrorRetryAttempts;
    private Integer phyTimeoutMillis;
    private String url;
	private String username;
	private String password;
	private String driverClassName;
	private String databaseName;
	
	public DataSource createDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(getDriverClassName());
        druidDataSource.setUrl(getUrl());
        druidDataSource.setUsername(getUsername());
        druidDataSource.setPassword(getPassword());
        //最大连接池数量
        druidDataSource.setMaxActive(50);
        //是否自动回收超时连接 
        druidDataSource.setRemoveAbandoned(true);
        //超时时间(以秒数为单位) 
        druidDataSource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
        /*打开druid.keepAlive之后，当连接池空闲时，池中的minIdle数量以内的连接，
	            * 空闲时间超过minEvictableIdleTimeMillis，则会执行keepAlive操作，
	            * 即执行druid.validationQuery指定的查询SQL，一般为select * from dual，
	            * 只要minEvictableIdleTimeMillis设置的小于防火墙切断连接时间，就可以保证当连接空闲时自动做保活检测，
	            * 不会被防火墙切断
        */
        druidDataSource.setKeepAlive(true); //开启
        druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis); //设置防切断最小生成时间为40毫秒
        druidDataSource.setMaxEvictableIdleTimeMillis(maxEvictableIdleTimeMillis);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setInitialSize(initialSize);
        //建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
        druidDataSource.setTestWhileIdle(true);
        // Destroy线程会检测连接的间隔时间(设置为1分钟)
        druidDataSource.setTimeBetweenEvictionRunsMillis(betweenEvictionRunsMillis);
        //失败重连次数
		druidDataSource.setConnectionErrorRetryAttempts(connectionErrorRetryAttempts);
		druidDataSource.setPhyTimeoutMillis(phyTimeoutMillis);
		druidDataSource.setRemoveAbandoned(true);
		druidDataSource.setMaxWait(maxTimeOut);
		return druidDataSource;
    }
}

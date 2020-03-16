package com.example.testConfig.db.ds;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

@ConfigurationProperties(prefix = "spring.datasource.businessr1")
@Component
public class BizR1DataSource extends AbstractDataSource{
	@Value("${spring.datasource.maxActive}")
    private Integer maxActive;
	
	public DataSource createDataSource() {
		DruidDataSource druidDataSource = (DruidDataSource)super.createDataSource();
		//最大连接池数量
	    druidDataSource.setMaxActive(maxActive);
	    return druidDataSource;
	}
}

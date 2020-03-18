package com.zxycloud.autoConfig.db.ds;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

@Component
public class FirePWDataSource extends AbstractDataSource{
	public DataSource createDataSource() {
		super.getMysqlModel();
		super.setDatabaseName("w", "firepatrol");
		DruidDataSource druidDataSource = (DruidDataSource)super.createDataSource();
	    return druidDataSource;
	}
}


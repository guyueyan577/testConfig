package com.zxycloud.autoConfig.db.ds;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

@Component
public class FirePR1DataSource extends AbstractDataSource{
	public DataSource createDataSource() {
		super.getMysqlModel();
		super.setDatabaseName("r1", "firepatrol");
		DruidDataSource druidDataSource = (DruidDataSource)super.createDataSource();
	    return druidDataSource;
	}
}

package com.zxycloud.autoConfig.db.ds;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

@Component
public class AssistR3DataSource extends AbstractDataSource {
	public DataSource createDataSource() {
		super.getMysqlModel();
		super.setDatabaseName("r3", "function_assist");
		DruidDataSource druidDataSource = (DruidDataSource)super.createDataSource();
	    return druidDataSource;
	}
}

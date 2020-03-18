package com.zxycloud.autoConfig.db.ds;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

@Component
public class PpermR1DataSource extends AbstractDataSource{
	public DataSource createDataSource() {
		super.getMysqlModel();
		super.setDatabaseName("r1", "project_permission");
		DruidDataSource druidDataSource = (DruidDataSource)super.createDataSource();
	    return druidDataSource;
	}
}


package com.zxycloud.autoConfig.db.ds;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

@Component
public class ThirdBizR1DataSource extends AbstractDataSource{
	public DataSource createDataSource() {
		super.getMysqlModel();
		super.setDatabaseName("r1", "third_business");
		DruidDataSource druidDataSource = (DruidDataSource)super.createDataSource();
	    return druidDataSource;
	}
}


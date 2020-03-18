package com.zxycloud.autoConfig.db.bizConfig;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zxycloud.autoConfig.db.ds.AssistR1DataSource;
import com.zxycloud.autoConfig.db.ds.AssistR2DataSource;
import com.zxycloud.autoConfig.db.ds.AssistR3DataSource;
import com.zxycloud.autoConfig.db.ds.AssistWDataSource;

@Configuration
public class AssistDataSourceConfig extends AbstractDataSourceConfig {

	@Autowired
	private AssistWDataSource assistWDataSource;


	@Bean("assistDataSource")
	public DataSource getDataSource() throws SQLException, InterruptedException {
		return buildDataSource();
	}

	private DataSource buildDataSource() throws SQLException, InterruptedException {
		DataSource masterDataSource = assistWDataSource.createDataSource();
		return this.buildDruidDataSource(masterDataSource,"assit_master_slave");
	}

	/**
	 * @param assistR1DataSource the assistR1DataSource to set
	 */
	@Autowired
	public void setAssistR1DataSource(AssistR1DataSource assistR1DataSource) {
		injectDataSourceMap.put(new Integer(1), assistR1DataSource);
	}

	/**
	 * @param assistR2DataSource the assistR2DataSource to set
	 */
	@Autowired
	public void setAssistR2DataSource(AssistR2DataSource assistR2DataSource) {
		injectDataSourceMap.put(new Integer(2), assistR2DataSource);
	}

	/**
	 * @param assistR3DataSource the assistR3DataSource to set
	 */
	@Autowired
	public void setAssistR3DataSource(AssistR3DataSource assistR3DataSource) {
		injectDataSourceMap.put(new Integer(3), assistR3DataSource);
	}

	
	
}

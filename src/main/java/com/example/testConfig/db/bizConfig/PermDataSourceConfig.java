package com.example.testConfig.db.bizConfig;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.testConfig.db.ds.PermR1DataSource;
import com.example.testConfig.db.ds.PermR2DataSource;
import com.example.testConfig.db.ds.PermR3DataSource;
import com.example.testConfig.db.ds.PermWDataSource;

@Configuration
public class PermDataSourceConfig extends AbstractDataSourceConfig{

    @Autowired
    private PermWDataSource wDataSource;

    @Bean("permissionDataSource")
    public DataSource getDataSource() throws SQLException, InterruptedException {
    	DataSource masterDataSource = wDataSource.createDataSource();
		return this.buildDruidDataSource(masterDataSource,"permission_master_slave");
    }

	/**
	 * @param r1DataSource the r1DataSource to set
	 */
    @Autowired
	public void setR1DataSource(PermR1DataSource r1DataSource) {
		injectDataSourceMap.put(new Integer(1), r1DataSource);
	}

	/**
	 * @param r2DataSource the r2DataSource to set
	 */
    @Autowired
	public void setR2DataSource(PermR2DataSource r2DataSource) {
		injectDataSourceMap.put(new Integer(2), r2DataSource);
	}

	/**
	 * @param r3DataSource the r3DataSource to set
	 */
    @Autowired
	public void setR3DataSource(PermR3DataSource r3DataSource) {
		injectDataSourceMap.put(new Integer(3), r3DataSource);
	}

  
}

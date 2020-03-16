package com.example.testConfig.db.bizConfig;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.testConfig.db.ds.FirePR1DataSource;
import com.example.testConfig.db.ds.FirePR2DataSource;
import com.example.testConfig.db.ds.FirePR3DataSource;
import com.example.testConfig.db.ds.FirePWDataSource;

@Configuration
public class FirePDataSourceConfig extends AbstractDataSourceConfig{

    @Autowired
    private FirePWDataSource wDataSource;

    @Bean("firePatrolDataSource")
    public DataSource getDataSource() throws SQLException, InterruptedException {
    	DataSource masterDataSource = wDataSource.createDataSource();
		return this.buildDruidDataSource(masterDataSource,"fire_patrol_master_slave");
    }

	/**
	 * @param r1DataSource the r1DataSource to set
	 */
    @Autowired
	public void setR1DataSource(FirePR1DataSource r1DataSource) {
		injectDataSourceMap.put(new Integer(1), r1DataSource);
	}

	/**
	 * @param r2DataSource the r2DataSource to set
	 */
    @Autowired
	public void setR2DataSource(FirePR2DataSource r2DataSource) {
    	injectDataSourceMap.put(new Integer(2), r2DataSource);
	}

	/**
	 * @param r3DataSource the r3DataSource to set
	 */
    @Autowired
	public void setR3DataSource(FirePR3DataSource r3DataSource) {
    	injectDataSourceMap.put(new Integer(3), r3DataSource);
	}
    
    
}
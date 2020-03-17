package com.example.testConfig.db.bizConfig;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.example.testConfig.db.ds.BizR1DataSource;
import com.example.testConfig.db.ds.BizR2DataSource;
import com.example.testConfig.db.ds.BizR3DataSource;
import com.example.testConfig.db.ds.BizWDataSource;

/**
 * @author chenjianwei
 * @date 2019年5月13日
 */

@Configuration
public class BizDataSourceConfig extends AbstractDataSourceConfig{

    @Autowired
    private BizWDataSource wDataSource;

    @Bean("businessDataSource")
    public DataSource getDataSource() throws SQLException, InterruptedException {
    	DataSource masterDataSource = wDataSource.createDataSource();
		return this.buildDruidDataSource(masterDataSource,"ds_master_slave");
    }

    @Bean(name = "businessTransactionManager")
    public DataSourceTransactionManager projectPermissionTransactionManager(@Qualifier("businessDataSource") DataSource businessDataSource) {
        return new DataSourceTransactionManager(businessDataSource);
    }

	/**
	 * @param r1DataSource the r1DataSource to set
	 */
    @Autowired
	public void setR1DataSource(BizR1DataSource r1DataSource) {
		injectDataSourceMap.put(new Integer(1), r1DataSource);
	}

	/**
	 * @param r2DataSource the r2DataSource to set
	 */
    @Autowired
	public void setR2DataSource(BizR2DataSource r2DataSource) {
		injectDataSourceMap.put(new Integer(2), r2DataSource);
	}

	/**
	 * @param r3DataSource the r3DataSource to set
	 */
    @Autowired
	public void setR3DataSource(BizR3DataSource r3DataSource) {
		injectDataSourceMap.put(new Integer(3), r3DataSource);
	}
}

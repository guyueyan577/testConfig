package com.zxycloud.autoConfig.db.bizConfig;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zxycloud.autoConfig.db.ds.ThirdBizR1DataSource;
import com.zxycloud.autoConfig.db.ds.ThirdBizR2DataSource;
import com.zxycloud.autoConfig.db.ds.ThirdBizR3DataSource;
import com.zxycloud.autoConfig.db.ds.ThirdBizWDataSource;

/**
 * 数据源配置
 * @author anxiaojian
 *
 * @date 2019年11月26日下午5:12:04
 */
@Configuration
public class ThirdBizDataSourceConfig extends AbstractDataSourceConfig{

    @Autowired
    private ThirdBizWDataSource wDataSource;

    @Bean("thirdBusinessDataSource")
    public DataSource getDataSource() throws SQLException, InterruptedException {
    	DataSource masterDataSource = wDataSource.createDataSource();
		return this.buildDruidDataSource(masterDataSource,"third_business_master_slave");
    }

    @Bean(name = "thirdBusinessTransactionManager")
    public DataSourceTransactionManager projectPermissionTransactionManager(@Qualifier("thirdBusinessDataSource") DataSource businessDataSource) {
        return new DataSourceTransactionManager(businessDataSource);
    }

	/**
	 * @param r1DataSource the r1DataSource to set
	 */
    @Autowired
	public void setR1DataSource(ThirdBizR1DataSource r1DataSource) {
    	injectDataSourceMap.put(new Integer(1), r1DataSource);
	}

	/**
	 * @param r2DataSource the r2DataSource to set
	 */
    @Autowired
	public void setR2DataSource(ThirdBizR2DataSource r2DataSource) {
    	injectDataSourceMap.put(new Integer(2), r2DataSource);
	}

	/**
	 * @param r3DataSource the r3DataSource to set
	 */
    @Autowired
	public void setR3DataSource(ThirdBizR3DataSource r3DataSource) {
    	injectDataSourceMap.put(new Integer(3), r3DataSource);
	}
    
 

}

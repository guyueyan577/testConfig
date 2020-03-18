package com.zxycloud.autoConfig.db.bizConfig;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zxycloud.autoConfig.db.ds.PpermR1DataSource;
import com.zxycloud.autoConfig.db.ds.PpermR2DataSource;
import com.zxycloud.autoConfig.db.ds.PpermR3DataSource;
import com.zxycloud.autoConfig.db.ds.PpermWDataSource;

@Configuration
public class PpermDataSourceConfig extends AbstractDataSourceConfig{

    @Autowired
    private PpermWDataSource wDataSource;

    @Bean("projectPermissionDataSource")
    public DataSource getDataSource() throws SQLException, InterruptedException {
    	DataSource masterDataSource = wDataSource.createDataSource();
		return this.buildDruidDataSource(masterDataSource,"project_permission_master_slave");
    }

	/**
	 * @param r1DataSource the r1DataSource to set
	 */
    @Autowired
	public void setR1DataSource(PpermR1DataSource r1DataSource) {
    	injectDataSourceMap.put(new Integer(1), r1DataSource);
	}

	/**
	 * @param r2DataSource the r2DataSource to set
	 */
    @Autowired
	public void setR2DataSource(PpermR2DataSource r2DataSource) {
    	injectDataSourceMap.put(new Integer(2), r2DataSource);
	}

	/**
	 * @param r3DataSource the r3DataSource to set
	 */
    @Autowired
	public void setR3DataSource(PpermR3DataSource r3DataSource) {
    	injectDataSourceMap.put(new Integer(3), r3DataSource);
	}

  
}

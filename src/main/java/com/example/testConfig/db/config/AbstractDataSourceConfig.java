package com.example.testConfig.db.config;

//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Properties;
//
//import javax.sql.DataSource;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.example.testConfig.db.config.extend.DataSourceValidator;
//import com.example.testConfig.db.config.extend.MasterSlaveForFailOverLoadBalanceAlgorithmType;
//import com.example.testConfig.db.config.extend.RoundRobinMasterSlaveForFailOverLoadBalanceAlgorithm;
//import com.example.testConfig.db.datasource.AbstractDataSource;
//
//import io.shardingsphere.api.config.rule.MasterSlaveRuleConfiguration;
//import io.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
//import lombok.extern.slf4j.Slf4j;

//@Slf4j
public abstract class AbstractDataSourceConfig {

//	protected Map<Integer, AbstractDataSource> injectDataSourceMap = new HashMap<Integer, AbstractDataSource>();
//
//	
//	protected DataSource buildDruidDataSource(DataSource masterDataSource,String masterSlaveName) throws SQLException, InterruptedException {
//
//		Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();
//		List<String> slaveList = new LinkedList<>();
//		Map<String,DataSource> slaveDataSourceMap = new HashMap<>();
//		dataSourceMap.put("ds_master",masterDataSource);
//		int slaves = 3;
//		for (int i = 1; i < slaves + 1; i++) {
//			AbstractDataSource injectDataSource = injectDataSourceMap.get((Integer) i);
//			Connection testCon = null;
//			DataSource dataSource = null;
//			DruidDataSource druidDataSource = null;
//			try {
//				dataSource = injectDataSource.createDataSource();
//				druidDataSource = (DruidDataSource)dataSource;
//				slaveDataSourceMap.put("ds_slave" + i, dataSource);
//				testCon = dataSource.getConnection();
//				dataSourceMap.put("ds_slave" + i, dataSource);
//				slaveList.add("ds_slave" + i);
//			} catch (Exception e) {
//				log.error("init database error:" + e.getMessage());
//				if(testCon!=null)
//					testCon.close();
//				druidDataSource.close();
//			}
//			finally {
//				if(testCon!=null)
//					testCon.close();
//			}
//		}
//
//		RoundRobinMasterSlaveForFailOverLoadBalanceAlgorithm algorithm = (RoundRobinMasterSlaveForFailOverLoadBalanceAlgorithm) MasterSlaveForFailOverLoadBalanceAlgorithmType.ROUND_ROBIN
//				.getAlgorithm();
//		MasterSlaveRuleConfiguration masterSlaveRuleConfig = new MasterSlaveRuleConfiguration(masterSlaveName,
//				"ds_master", slaveList, algorithm);
//		DataSource druidDataSource = MasterSlaveDataSourceFactory.createDataSource(dataSourceMap, masterSlaveRuleConfig,
//				new HashMap<String, Object>(), new Properties());
//		DataSourceValidator validator = new DataSourceValidator(slaveDataSourceMap, algorithm);
//		validator.start();
//		return druidDataSource;
//	}
}
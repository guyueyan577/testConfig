package com.zxycloud.autoConfig.db.bizConfig.extend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import javax.sql.DataSource;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chenjianwei
 * @date 2019年12月27日
 */
@Slf4j
public class DataSourceValidator {

	private  Map<String, DataSource> _unValidateDataSourceMap;
	
	private RoundRobinMasterSlaveForFailOverLoadBalanceAlgorithm _algorithm;

	public DataSourceValidator(Map<String, DataSource> unValidateDataSourceMap,RoundRobinMasterSlaveForFailOverLoadBalanceAlgorithm algorithm) {
		_unValidateDataSourceMap = unValidateDataSourceMap;
		_algorithm = algorithm;
	}
	
	public  void start() {
		Timer timer = new Timer();
    	TestConnectionTask  task = new TestConnectionTask();
    	timer.schedule(task, 30000l,60000l);
	}
	
	private class TestConnectionTask extends TimerTask {

		@Override
		public void run() {
			List<String> slaveDataSourceNames = null;
			try {
				slaveDataSourceNames = testAllDataSourceValidation(_unValidateDataSourceMap);
				_algorithm.setSlaveDataSourceNames(slaveDataSourceNames);
			} catch (Exception e) {
				log.error("Invalid connection testing error:",e);
			}
		}
	}

	public List<String> testAllDataSourceValidation(Map<String, DataSource> dataSourceMap) throws Exception {
		List<String> _slaveDataSourceNames = new ArrayList<String>();
		if (dataSourceMap != null && dataSourceMap.size() > 0) {
			Set<String> keys = dataSourceMap.keySet();
			Iterator<String> it = keys.iterator();
			while (it.hasNext()) {
				String key = it.next();
				DataSource dataSource = dataSourceMap.get(key);
				if (testDataSource(key,dataSource)) {
					_slaveDataSourceNames.add(key);					
				}
			}
		}
		return _slaveDataSourceNames;
	}

//	private long ccc = 0L;
	private boolean testDataSource(String key,DataSource dataSource) throws SQLException {
		Connection con = null;
		PreparedStatement statement = null;
		String sql = "select 1 from dual";
		try {
			con = dataSource.getConnection();
			statement = con.prepareStatement(sql);
			statement.executeQuery();
		} catch (Throwable e) {
			releaseConnection(con, statement);
			return false;
		}
		finally {
			releaseConnection(con, statement);
		}
		return true;
	}

	/**
	 * @author chenjianwei
	 * @date 2019年12月30日
	 * @param con
	 * @param statement
	 * @throws SQLException
	 */
	private void releaseConnection(Connection con, PreparedStatement statement) throws SQLException {
		if(statement!=null && !statement.isClosed())
			statement.close();
		
		if(con!=null && !con.isClosed())
			con.close();
	}
}

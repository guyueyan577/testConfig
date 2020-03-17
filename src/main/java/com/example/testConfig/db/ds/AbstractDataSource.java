package com.example.testConfig.db.ds;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSONObject;
import com.example.testConfig.configModel.MysqlConfigModel;
import com.example.testConfig.utils.HttpRequest;

import lombok.Data;

/**
 * @author chenjianwei
 * @date 2019年12月27日
 */
@Data
public abstract class AbstractDataSource {
	@Value("${config.url}")
	String configUrl;
	
	private  static MysqlConfigModel mysqlModel = null;
	private String databaseUrl = "";
	
	
	//从配置服务器获取数据源配置信息
	protected void getMysqlModel() {
		//只需要读取一次
		if (mysqlModel == null) {
			synchronized ("sql")
			{
				String strMySqlConfig = HttpRequest.sendGet(configUrl + "/mysql", "");        
		        if (StringUtils.isNotBlank(strMySqlConfig)){        	
		        	mysqlModel = JSONObject.parseObject(strMySqlConfig, MysqlConfigModel.class);
		        }
			}
		}
	}
	
	/**
	 * * @Description: 根据之类所传参数，构造数据库的连接url
	 * @author: chenjianwei
	 * @date: 2020-03-17
	 * @param dataType
	 * @param databaseName
	 * @return: void      
	 * @throws
	 */
	protected void setDatabaseName(String dataType, String databaseName) {
		if (dataType.equalsIgnoreCase("w")){			
			databaseUrl = mysqlModel.getWriteDbUrl() + "/" + databaseName;
		}else if (dataType.equalsIgnoreCase("r1")){
			databaseUrl = mysqlModel.getRead1Dburl() + "/" + databaseName;
		} else if (dataType.equalsIgnoreCase("r2")){
			databaseUrl = mysqlModel.getRead2Dburl() + "/" + databaseName;
		} else if (dataType.equalsIgnoreCase("r3")){
			databaseUrl = mysqlModel.getRead3Dburl() + "/" + databaseName;
		}
	}

	public DataSource createDataSource() {
		if (StringUtils.isBlank(databaseUrl) || mysqlModel == null) {
			return null;
		}
		
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(mysqlModel.getDriverClassName());
        druidDataSource.setUrl(databaseUrl + mysqlModel.getConfigInfo());
        druidDataSource.setUsername(mysqlModel.getUserName());
        druidDataSource.setPassword(mysqlModel.getPassword());
        //最大连接池数量
        druidDataSource.setMaxActive(50);
        //是否自动回收超时连接 
        druidDataSource.setRemoveAbandoned(true);
        //超时时间(以秒数为单位) 
        druidDataSource.setRemoveAbandonedTimeout(mysqlModel.getRemoveAbandonedTimeout());
        /*打开druid.keepAlive之后，当连接池空闲时，池中的minIdle数量以内的连接，
	            * 空闲时间超过minEvictableIdleTimeMillis，则会执行keepAlive操作，
	            * 即执行druid.validationQuery指定的查询SQL，一般为select * from dual，
	            * 只要minEvictableIdleTimeMillis设置的小于防火墙切断连接时间，就可以保证当连接空闲时自动做保活检测，
	            * 不会被防火墙切断
        */
        druidDataSource.setKeepAlive(true); //开启
        druidDataSource.setMinEvictableIdleTimeMillis(mysqlModel.getMinEvictableIdleTimeMillis()); //设置防切断最小生成时间为40毫秒
        druidDataSource.setMaxEvictableIdleTimeMillis(mysqlModel.getMaxEvictableIdleTimeMillis());
        druidDataSource.setMinIdle(mysqlModel.getMinIdle());
        druidDataSource.setInitialSize(mysqlModel.getInitialSize());
        //建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
        druidDataSource.setTestWhileIdle(true);
        //Destroy线程会检测连接的间隔时间(设置为1分钟)
        druidDataSource.setTimeBetweenEvictionRunsMillis(mysqlModel.getBetweenEvictionRunsMillis());
        //失败重连次数
		druidDataSource.setConnectionErrorRetryAttempts(mysqlModel.getConnectionErrorRetryAttempts());
		druidDataSource.setPhyTimeoutMillis(mysqlModel.getPhyTimeoutMillis());
		druidDataSource.setRemoveAbandoned(true);
		druidDataSource.setMaxWait(mysqlModel.getMaxWait());
		return druidDataSource;
    }
}
package com.example.testConfig.db;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = PermissionDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "permissionSqlSessionFactory")
public class PermissionDataSourceConfig 
{
    static final String PACKAGE = "com.example.testConfig.db.mybatis.mapper.permission";
    static final String MAPPER_LOCATION = "classpath:com/zxycloud/common/dao/db/map/permission/*.xml";

    @Bean(name = "permissionTransactionManager")
    public DataSourceTransactionManager permissionTransactionManager(@Qualifier("permissionDataSource") DataSource permissionDataSource) {
        return new DataSourceTransactionManager(permissionDataSource);
    }
 
    @Bean(name = "permissionSqlSessionFactory")
    public SqlSessionFactory permissionSqlSessionFactory(@Qualifier("permissionDataSource") DataSource permissionDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(permissionDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(PermissionDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}

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
@MapperScan(basePackages = FirePatrolDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "firePatrolSqlSessionFactory")
public class FirePatrolDataSourceConfig 
{
    static final String PACKAGE = "com.example.testConfig.db.mybatis.mapper.firepatrol";
    static final String MAPPER_LOCATION = "classpath:com/example/testConfig/db/mybatis/map/firepatrol/*.xml";

 
    @Bean(name = "firePatrolTransactionManager")
    public DataSourceTransactionManager firePatrolTransactionManager(@Qualifier("firePatrolDataSource") DataSource firePatrolDataSource) {
        return new DataSourceTransactionManager(firePatrolDataSource);
    }
 
    @Bean(name = "firePatrolSqlSessionFactory")
    public SqlSessionFactory firePatrolSqlSessionFactory(@Qualifier("firePatrolDataSource") DataSource firePatrolDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(firePatrolDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(FirePatrolDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}

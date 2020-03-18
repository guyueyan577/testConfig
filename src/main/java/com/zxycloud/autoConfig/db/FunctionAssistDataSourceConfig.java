package com.zxycloud.autoConfig.db;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = FunctionAssistDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "assistSqlSessionFactory")
public class FunctionAssistDataSourceConfig {
    static final String PACKAGE = "com.zxycloud.autoConfig.db.mybatis.mapper.assist";
    static final String MAPPER_LOCATION = "classpath:com/zxycloud/autoConfig/db/mybatis/map/assist/*.xml";


    @Bean(name = "assistTransactionManager")
    public DataSourceTransactionManager assistTransactionManager(@Qualifier("assistDataSource") DataSource assistDataSource) {
        return new DataSourceTransactionManager(assistDataSource);
    }

    @Bean(name = "assistSqlSessionFactory")
    public SqlSessionFactory assistSqlSessionFactory(@Qualifier("assistDataSource") DataSource assistDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(assistDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(FunctionAssistDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}

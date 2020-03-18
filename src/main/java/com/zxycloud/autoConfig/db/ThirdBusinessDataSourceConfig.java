package com.zxycloud.autoConfig.db;

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
@MapperScan(basePackages = ThirdBusinessDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "thirdBusinessSqlSessionFactory")
public class ThirdBusinessDataSourceConfig 
{
    static final String PACKAGE = "com.zxycloud.autoConfig.db.mybatis.mapper.thirdbiz";
    static final String MAPPER_LOCATION = "classpath:com/zxycloud/autoConfig/db/mybatis/map/thirdbiz/*.xml";

 
    @Bean(name = "thirdBusinessTransactionManager")
    public DataSourceTransactionManager firePatrolTransactionManager(@Qualifier("thirdBusinessDataSource") DataSource firePatrolDataSource) {
        return new DataSourceTransactionManager(firePatrolDataSource);
    }
 
    @Bean(name = "thirdBusinessSqlSessionFactory")
    public SqlSessionFactory firePatrolSqlSessionFactory(@Qualifier("thirdBusinessDataSource") DataSource firePatrolDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(firePatrolDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(ThirdBusinessDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}

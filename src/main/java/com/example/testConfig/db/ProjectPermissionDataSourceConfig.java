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
@MapperScan(basePackages = ProjectPermissionDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "projectPermissionSqlSessionFactory")
public class ProjectPermissionDataSourceConfig 
{
    static final String PACKAGE = "com.example.testConfig.db.mybatis.mapper.projectpermission";
    static final String MAPPER_LOCATION = "classpath:com/zxycloud/common/dao/db/map/projectpermission/*.xml";
 
    @Bean(name = "projectPermissionTransactionManager")
    public DataSourceTransactionManager projectPermissionTransactionManager(@Qualifier("projectPermissionDataSource") DataSource projectPermissionDataSource) {
        return new DataSourceTransactionManager(projectPermissionDataSource);
    }
 
    @Bean(name = "projectPermissionSqlSessionFactory")
    public SqlSessionFactory projectPermissionSqlSessionFactory(@Qualifier("projectPermissionDataSource") DataSource projectPermissionDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(projectPermissionDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(ProjectPermissionDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}

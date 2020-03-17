package com.example.testConfig.db.bizConfig;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author chenjianwei
 * @date 2019年5月13日
 */
@EnableTransactionManagement
@Configuration
@MapperScan(basePackages = MyBatisConfig.PACKAGE, sqlSessionFactoryRef = "sqlSessionFactory")
public class MyBatisConfig {
	static final String PACKAGE = "com.example.testConfig.db.mybatis.mapper.biz";
    static final String MAPPER_LOCATION = "classpath:com/example/testConfig/db/mybatis/map/biz/*.xml";
    
	@Autowired
    @Qualifier("businessDataSource")
    private DataSource businessDataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
    	final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(businessDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager(businessDataSource);
    }
}

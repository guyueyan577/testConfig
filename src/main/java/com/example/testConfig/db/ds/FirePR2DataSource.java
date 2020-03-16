package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.firepatrolr2")
@Component
public class FirePR2DataSource extends AbstractDataSource{
}


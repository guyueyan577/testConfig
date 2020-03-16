package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.firepatrolr1")
@Component
public class FirePR1DataSource extends AbstractDataSource{
}

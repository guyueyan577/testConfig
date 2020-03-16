package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.firepatrolr3")
@Component
public class FirePR3DataSource extends AbstractDataSource{
}

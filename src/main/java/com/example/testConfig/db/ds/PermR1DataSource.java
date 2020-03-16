package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.permissionr1")
@Component
public class PermR1DataSource extends AbstractDataSource{
}

package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.projectpermissionr1")
@Component
public class PpermR1DataSource extends AbstractDataSource{
}


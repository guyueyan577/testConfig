package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.projectpermissionr2")
@Component
public class PpermR2DataSource extends AbstractDataSource{
}


package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.projectpermissionr3")
@Component
public class PpermR3DataSource extends AbstractDataSource{
}


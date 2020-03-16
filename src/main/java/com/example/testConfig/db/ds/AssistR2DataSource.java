package com.example.testConfig.db.ds;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.assistr2")
@Component
public class AssistR2DataSource extends AbstractDataSource {
}

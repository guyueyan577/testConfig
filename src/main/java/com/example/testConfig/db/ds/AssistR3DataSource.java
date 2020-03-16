package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "spring.datasource.assistr3")
@Component
public class AssistR3DataSource extends AbstractDataSource {
}

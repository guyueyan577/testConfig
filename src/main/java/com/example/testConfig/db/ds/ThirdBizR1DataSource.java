package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.thirdbusiness1")
@Component
public class ThirdBizR1DataSource extends AbstractDataSource{
}


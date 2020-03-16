package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.thirdbusiness2")
@Component
public class ThirdBizR2DataSource extends AbstractDataSource{
}

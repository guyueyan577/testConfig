package com.example.testConfig.db.ds;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.thirdbusiness")
@Component
public class ThirdBizWDataSource extends AbstractDataSource{
}

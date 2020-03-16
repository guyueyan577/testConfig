package com.example.testConfig.configModel;

import lombok.Data;

@Data
public class RabbitMqConfigModel {
	String addresses;
	String username;
	String password;
	String virtualHost;
}

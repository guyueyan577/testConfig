package com.example.testConfig.configModel;

import lombok.Data;

@Data
public class RabbitMqModel {
	String addresses;
	String username;
	String password;
	String virtualHost;
}

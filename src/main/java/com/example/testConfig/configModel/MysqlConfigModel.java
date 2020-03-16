package com.example.testConfig.configModel;

import lombok.Data;

@Data
public class MysqlConfigModel {
	String writeDbUrl;
	String read1Dburl;
	String read2Dburl;
	String read3Dburl;
	
	String userName;
	String password;
	String configInfo;
}

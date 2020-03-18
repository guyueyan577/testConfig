package com.example.testConfig;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.example.testConfig.configModel.MongoConfigModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NonelTest {

	@Test
	public void monoTest() {
		MongoConfigModel monModel = new MongoConfigModel();
		log.info(JSONObject.toJSONString(monModel));
	}
}

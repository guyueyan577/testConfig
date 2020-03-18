package com.zxycloud.autoConfig;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.zxycloud.autoConfig.configModel.MongoConfigModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NonelTest {

	@Test
	public void monoTest() {
		MongoConfigModel monModel = new MongoConfigModel();
		log.info(JSONObject.toJSONString(monModel));
	}
}

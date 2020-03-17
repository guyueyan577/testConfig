package com.example.testConfig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.testConfig.db.mybatis.mapper.assist.AppTypeMetadataMapper;
import com.example.testConfig.db.mybatis.model.assist.AppTypeMetadata;
import com.example.testConfig.db.mybatis.model.assist.AppTypeMetadataExample;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MysqlController {
	@Autowired
	AppTypeMetadataMapper appTypeMetadataMapper;
	
	@GetMapping("getMySqlInfo")
	public String getMySqlInfo() {
		List<AppTypeMetadata>  appTypeList = appTypeMetadataMapper.selectByExample(new AppTypeMetadataExample());
		log.info(JSONObject.toJSONString(appTypeList));
		return JSONObject.toJSONString(appTypeList);
	}
}

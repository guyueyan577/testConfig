package com.example.testConfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testConfig.config.MongoConfig;

import lombok.extern.slf4j.Slf4j;

@RestController
public class MonoController {
	@Autowired
	MongoTemplate mongoTemplate;
	@Autowired
	MongoConfig mongoConfig;
	
	@PostMapping("sendMongoInfo")
	public void sendMongoInfo() {
		
		mongoTemplate.save(mongoConfig.getMonoInfo());
	}
}

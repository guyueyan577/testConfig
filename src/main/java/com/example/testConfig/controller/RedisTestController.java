package com.example.testConfig.controller;

import javax.annotation.Resource;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testConfig.testModel.RedisTestModel;

@RestController
public class RedisTestController {
	@Resource(name = "deviceStringRedisTemplate")
    private StringRedisTemplate stringRedisTemplate;

	@PostMapping("setRedisInfo")
	public void setRedisInfo(@RequestBody RedisTestModel redisModel) {
		stringRedisTemplate.opsForValue().set(redisModel.getKey(), redisModel.getValue());
	}
	
	@GetMapping("getRedisInfo")
	public String getRedisInfo(@RequestParam String key) {
		String value = stringRedisTemplate.opsForValue().get(key);
		return value;
	}
}

package com.zxycloud.autoConfig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zxycloud.autoConfig.config.KafkaSendResultHandler;
import com.zxycloud.autoConfig.testModel.RedisTestModel;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class KafkaController {

	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
    private KafkaSendResultHandler producerListener;
	@Value("${spring.application.name}")
	String applicationName;
	
	@PostMapping("sendKafka")
	public void setRedisInfo(@RequestBody RedisTestModel redisModel) {
		 //kafka发送数据
        String kafkaKey = String.valueOf(System.currentTimeMillis());
        kafkaTemplate.setProducerListener(producerListener);
        kafkaTemplate.send(applicationName, kafkaKey, redisModel.getValue());
	}
	
	@KafkaListener(topics = {"${spring.application.name}"}, containerFactory = "kafkaListenerContainerFactory")
	public void consumerMsg(List<String> records, Acknowledgment ack){
		ack.acknowledge();//手动提交偏移量
		long t0 = System.currentTimeMillis();
	    try {
	            for (String record : records) {
	            	log.info("收到消息：" + record);
	            }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	    	long t2 = System.currentTimeMillis();
	        log.info("------------------------------------- commit offset,spent time:"+(t2-t0));
	    }
	}
}

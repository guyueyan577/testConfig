package com.zxycloud.autoConfig.config;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaSendResultHandler implements ProducerListener<String, String>  {

	@Override
	public void onSuccess(String topic, Integer partition, String key, String value, RecordMetadata metadata) {
//		log.info("发送消息到kafka完成，当前消息偏移为：" + metadata.offset() + ", 消息发往分区: " + metadata.partition() + 
//    			", topicName: " + topic + ", key: "+ key + " , value: " + value);
	}

	@Override
	public void onError(String topic, Integer partition, String key, String value, Exception exception) {
		log.error("发送消息到kafka失败：key:" + key + ",value:" + value, exception);
	}
	
}
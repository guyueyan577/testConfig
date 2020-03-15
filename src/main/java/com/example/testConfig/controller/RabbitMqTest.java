package com.example.testConfig.controller;

import java.io.IOException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RabbitMqTest {

	@RabbitListener(queues = {"message.test"})
	public void process(Message message, Channel channel) throws IOException{
		//获取接收消息
		String receiveContent = new String(message.getBody(),"UTF-8");			
		log.info("接收消息"+receiveContent);
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
	}
}

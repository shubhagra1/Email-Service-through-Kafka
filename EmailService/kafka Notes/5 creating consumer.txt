package com.kafkaTutorial.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KakfaConsumer {

	
	@KafkaListener(topics = "testTopic2" , groupId = "myGroup")
	public void consume(String message) {
		log.info("Message received :"+message);
	}
	
}

package com.kafkaTutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	//creating a new topic with name testTopic,can give custom partitions
//	@Bean
//	public NewTopic myTopic() {
//		return TopicBuilder.name("testTopic1")
//				.build();
//				//.partitions(10)
//	}
}

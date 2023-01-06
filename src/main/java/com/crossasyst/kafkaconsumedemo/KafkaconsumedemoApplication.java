package com.crossasyst.kafkaconsumedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaconsumedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaconsumedemoApplication.class, args);
	}

}

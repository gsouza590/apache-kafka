package com.gabriel.json_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gabriel.json_consumer", "config"})

public class JsonConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonConsumerApplication.class, args);
	}

}

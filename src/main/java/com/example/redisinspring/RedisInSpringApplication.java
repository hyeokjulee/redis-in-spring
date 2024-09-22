package com.example.redisinspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class RedisInSpringApplication {

	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.yml,"
			+ "/app/config/bookitaka/real-application2.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(RedisInSpringApplication.class)
				.properties(APPLICATION_LOCATIONS)
				.run(args);
	}
}
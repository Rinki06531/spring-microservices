package com.microservices.userserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceClientApplication.class, args);
	}

}

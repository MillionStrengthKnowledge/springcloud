package com.millionstrengthknowledge.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RestfulServiceServer {
	public static void main(String[] args) {
		SpringApplication.run(RestfulServiceServer.class, args);
	}
}

package com.dzl.cloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudeurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudeurekaApplication.class, args);
	}

}

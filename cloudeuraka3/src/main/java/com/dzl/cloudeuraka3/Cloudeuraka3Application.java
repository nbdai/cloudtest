package com.dzl.cloudeuraka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cloudeuraka3Application {
    public static void main(String[] args) {
        SpringApplication.run(Cloudeuraka3Application.class, args);
    }
}

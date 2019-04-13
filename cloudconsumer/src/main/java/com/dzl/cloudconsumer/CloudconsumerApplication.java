package com.dzl.cloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudconsumerApplication.class, args);
    }

}

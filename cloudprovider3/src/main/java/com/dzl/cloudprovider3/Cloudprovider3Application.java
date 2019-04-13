package com.dzl.cloudprovider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cloudprovider3Application {

    public static void main(String[] args) {
        SpringApplication.run(Cloudprovider3Application.class, args);
    }

}

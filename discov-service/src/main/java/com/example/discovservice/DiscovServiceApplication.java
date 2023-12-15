package com.example.discovservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscovServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(DiscovServiceApplication.class, args);
    }

}

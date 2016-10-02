package com.forest.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by dennislee on 1/10/16.
 */

@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}

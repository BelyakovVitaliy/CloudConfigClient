package com.sberbank.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientApplication.class, args);
    }

}

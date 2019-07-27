package com.sberbank.springcloudclient.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("message: default message")
    private String greeting;

    @GetMapping("greeting")
    public String greeting() {
        return greeting;
    }
}

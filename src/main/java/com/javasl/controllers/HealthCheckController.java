package com.javasl.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HealthCheckController {

    @RequestMapping("/health")
    public String healthCheck(){
        return "healthy";
    }

    @GetMapping("/health/traffic")
    public String healthCheckTraffic(){
        return "healthy";
    }
}
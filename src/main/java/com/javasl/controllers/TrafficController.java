package com.javasl.controllers;

import com.javasl.models.trafficsituation.TrafficSituation;
import com.javasl.services.TrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/api/v1")
public class TrafficController {
    @Autowired
    private TrafficService trafficService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/trafficsituation")
    public TrafficSituation getTrafficSituation(){
        return trafficService.getTrafficSituation();
    }
}
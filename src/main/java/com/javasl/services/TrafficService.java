package com.javasl.services;

import com.javasl.models.trafficsituation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Service
public class TrafficService {

    private static final Logger log = LoggerFactory.getLogger(TrafficService.class);
	//private RestTemplate client;

	public TrafficService(){
		//RestTemplateBuilder builder = new RestTemplateBuilder();
		//client = restTemplate(builder);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
    
    public TrafficSituation getTrafficSituation(){
		RestTemplateBuilder builder = new RestTemplateBuilder();
		RestTemplate restTemplate = restTemplate(builder);
		TrafficSituation situation = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", TrafficSituation.class);
		
		log.info(situation.toString());
		return situation;
    }
}
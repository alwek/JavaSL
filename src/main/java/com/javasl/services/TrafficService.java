package com.javasl.services;

import com.javasl.models.trafficsituation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class TrafficService {
	private static final Logger log = LoggerFactory.getLogger(TrafficService.class);
	private WebClient client;

	public TrafficService(WebClient.Builder webClientBuilder){
		this.client = webClientBuilder.baseUrl("http://localhost:8080").build();
	}
    
    public TrafficSituation getTrafficSituation(){
		Mono<String> result = client
			.get()
			.uri(uriBuilder -> uriBuilder
				.path("/api/v1/hello")
				.query("")
				.build())
			.retrieve()
			.bodyToMono(String.class);

		TrafficSituation situation = new TrafficSituation();
		situation.setMessage(result.block());

		log.info("succesfully requested hello");
		return situation;
    }
}
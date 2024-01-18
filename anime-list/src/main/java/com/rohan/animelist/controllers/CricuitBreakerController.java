package com.rohan.animelist.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CricuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CricuitBreakerController.class);

	@GetMapping("/sample-api")
	// @Retry(name = "sample-api", fallbackMethod = "hardCodedResponse")
	//@CircuitBreaker(name = "default", fallbackMethod = "hardCodedResponse")
	@RateLimiter(name = "default")
	public String sampleApi() {
		
		logger.info("Sample Api call recieved");
		
//		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8100/dummy-url",
//				String.class);
//
//		return forEntity.getBody();
		
		return "sample-api";

	}
	
	private String hardCodedResponse(Exception ex) {
		
		return "fallback-response";
		
	}

}

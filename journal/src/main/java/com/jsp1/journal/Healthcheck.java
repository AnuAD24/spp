package com.jsp1.journal;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {
	@GetMapping("/health")
	public String check() {
		return "hello";
		
	}
}

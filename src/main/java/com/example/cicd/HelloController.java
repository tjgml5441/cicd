package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String hello() {
		return "Hello CICD with Docker and Github Action";
	}
}

// build -> cicd.jar + Google Jib Tool -> container -> run

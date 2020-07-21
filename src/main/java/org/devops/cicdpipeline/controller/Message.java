package org.devops.cicdpipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World";
	}
}

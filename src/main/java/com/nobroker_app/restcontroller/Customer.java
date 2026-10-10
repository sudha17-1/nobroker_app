package com.nobroker_app.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nobroker")
public class Customer {
	
	@GetMapping("/Welcome")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/Hello")
	public String hello() {
		return "Hello";
	}

}

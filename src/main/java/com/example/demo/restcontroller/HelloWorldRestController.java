package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot With Gradle!!!! Check";
	}
	
}

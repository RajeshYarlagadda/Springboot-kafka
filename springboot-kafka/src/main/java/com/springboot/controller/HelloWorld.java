package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(path="/hello/")
	public String sayHello(@RequestParam String message) {
		return "Welcome to SpringBoot Mr. "+message;
	}
}

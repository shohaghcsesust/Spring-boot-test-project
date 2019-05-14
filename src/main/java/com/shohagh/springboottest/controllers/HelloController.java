package com.shohagh.springboottest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/sayHelloWorld")
	public String printHello() {
		return "Hello, World!";
	}
}
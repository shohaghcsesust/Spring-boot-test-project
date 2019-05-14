package com.shohagh.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {
		SpringBootTestProjectApplication.class,
	    SomeClassInTheOtherPackage.class})
public class SpringBootTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestProjectApplication.class, args);
	}

}

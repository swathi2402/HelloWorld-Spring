package com.bridgelabz.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bridgelabz.controller"})
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello From Bridgelabz");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}

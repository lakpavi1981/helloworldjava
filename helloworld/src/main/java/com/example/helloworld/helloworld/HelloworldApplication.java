package com.example.helloworld.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloworldApplication.class, args);

	}

	public static String helloworldprint(){
		System.out.println("Hellow World");
		return "HelloWorld";

	}
}

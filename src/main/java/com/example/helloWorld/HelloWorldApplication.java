package com.example.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("version2");
		System.out.println("IDEA helloWorld version1");
		//master 修改
		System.out.println("IDEA helloWorld version2");
	}

}

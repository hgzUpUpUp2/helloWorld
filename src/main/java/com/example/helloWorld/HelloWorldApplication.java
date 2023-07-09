package com.example.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.printlin("version2");
		//hgzUpUpUp修改的代码
		System.out.printlin("version edit by hgzUpUpUp");
	}

}

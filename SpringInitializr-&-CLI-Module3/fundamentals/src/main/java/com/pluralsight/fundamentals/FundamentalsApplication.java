package com.pluralsight.fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentalsApplication { //class is used to bootstrap and launch srping application from a java main method
	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
		System.out.println("Hello Pluralsight!");
	}
}

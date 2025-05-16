package com.visitor.management.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitorManagementApplication {

	public static void main(String[] args) {
		System.out.println("Logging out!");
		SpringApplication.run(VisitorManagementApplication.class, args);
	}

}

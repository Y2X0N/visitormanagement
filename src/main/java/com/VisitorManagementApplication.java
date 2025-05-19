package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@SpringBootApplication
@EntityScan("com.user.management.model")
public class VisitorManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitorManagementApplication.class, args);
	}
}

package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "shop",
				version = "1.2.3",
				description = "none",
				contact = @Contact(
						name = "mani",
						email = "ro123@gmail.com"
						)
				)
		)
public class One2oneApplication {

	public static void main(String[] args) {
		SpringApplication.run(One2oneApplication.class, args);
	}

}

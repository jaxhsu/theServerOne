package com.example.theServerOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class TheServerOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheServerOneApplication.class, args);
	}

}

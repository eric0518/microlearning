package com.eric.eurakeserverscc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakeServerSccApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakeServerSccApplication.class, args);
	}
}

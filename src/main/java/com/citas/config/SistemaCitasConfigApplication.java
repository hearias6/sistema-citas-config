package com.citas.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SistemaCitasConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaCitasConfigApplication.class, args);
	}

}

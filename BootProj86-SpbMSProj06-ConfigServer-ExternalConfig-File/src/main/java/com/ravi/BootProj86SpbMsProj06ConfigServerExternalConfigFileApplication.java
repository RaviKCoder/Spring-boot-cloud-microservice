package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootProj86SpbMsProj06ConfigServerExternalConfigFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj86SpbMsProj06ConfigServerExternalConfigFileApplication.class, args);
	}

}

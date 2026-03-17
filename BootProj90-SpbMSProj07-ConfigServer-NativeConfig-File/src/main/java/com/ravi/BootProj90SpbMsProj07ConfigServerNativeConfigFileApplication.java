package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootProj90SpbMsProj07ConfigServerNativeConfigFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj90SpbMsProj07ConfigServerNativeConfigFileApplication.class, args);
	}

}

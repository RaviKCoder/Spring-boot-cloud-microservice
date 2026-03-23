package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootProj91SpbMsProj08EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj91SpbMsProj08EurekaServerApplication.class, args);
	}

}

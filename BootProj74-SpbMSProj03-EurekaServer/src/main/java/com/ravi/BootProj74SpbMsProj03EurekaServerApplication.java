package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootProj74SpbMsProj03EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj74SpbMsProj03EurekaServerApplication.class, args);
	}

}

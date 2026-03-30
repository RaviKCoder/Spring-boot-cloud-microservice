package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class BootProj99U3SpbMSProj11EurekaServerELKApplication {

	public static void main(String[] args) {
		log.debug("Eureka server(Start of Log message)");
		SpringApplication.run(BootProj99U3SpbMSProj11EurekaServerELKApplication.class, args);
		log.debug("Eureka server(End of Log message)");
	}

}

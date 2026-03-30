package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableAdminServer
@Slf4j
public class BootProj99U6SpbMSProj11AdminServerELKApplication {

	public static void main(String[] args) {
		
		log.debug("Start of Admin server");
		SpringApplication.run(BootProj99U6SpbMSProj11AdminServerELKApplication.class, args);
		log.debug("End of Admin server");
	}

}

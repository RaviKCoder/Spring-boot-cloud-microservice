package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
@Slf4j
public class BootProj99U5SpbMSProj11ConsumerCartMSELKApplication {

	public static void main(String[] args) {
		
		log.debug("from the Start of CartMS application");
		SpringApplication.run(BootProj99U5SpbMSProj11ConsumerCartMSELKApplication.class, args);
		log.debug("from the End of CartMS application");
	}

}

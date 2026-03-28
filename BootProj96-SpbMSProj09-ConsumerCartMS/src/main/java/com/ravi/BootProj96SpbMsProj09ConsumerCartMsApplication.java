package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class BootProj96SpbMsProj09ConsumerCartMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj96SpbMsProj09ConsumerCartMsApplication.class, args);
	}

}

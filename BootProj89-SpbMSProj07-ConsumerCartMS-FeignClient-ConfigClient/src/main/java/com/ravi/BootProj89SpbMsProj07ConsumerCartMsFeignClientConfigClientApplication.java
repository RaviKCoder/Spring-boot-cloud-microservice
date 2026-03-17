package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BootProj89SpbMsProj07ConsumerCartMsFeignClientConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj89SpbMsProj07ConsumerCartMsFeignClientConfigClientApplication.class, args);
	}

}

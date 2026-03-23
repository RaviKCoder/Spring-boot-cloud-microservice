package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class BootProj93SpbMsProj08ConsumerCartMsActuatorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj93SpbMsProj08ConsumerCartMsActuatorsApplication.class, args);
	}

}

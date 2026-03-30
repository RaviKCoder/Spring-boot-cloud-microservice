package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class BootProj99U4SpbMSProj11ProviderBillingMSELKApplication {

	public static void main(String[] args) {
		
		log.debug("Start of Billing Ms");
		SpringApplication.run(BootProj99U4SpbMSProj11ProviderBillingMSELKApplication.class, args);
		log.debug("End of Billing Ms");
	}

}

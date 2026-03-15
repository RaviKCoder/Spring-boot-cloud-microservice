package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootProj81SpbMsProj05ProviderBillingMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj81SpbMsProj05ProviderBillingMsApplication.class, args);
	}

}

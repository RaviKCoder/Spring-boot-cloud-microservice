package com.ravi.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingMSInvokerClient {

	@Autowired
	private LoadBalancerClient client;
	

	public ResponseEntity<String> invokeGenerateBillAmount(){
		
		System.out.println("BillingMSInvokerClient.invokeGenerateBillAmount()->client component class name"+client.getClass());
		
		//get Target MS service instance
		ServiceInstance instance = client.choose("ProviderBillingMS");
		
		//get the end point details
		String url=instance.getUri()+"/billing-api/doBill";
		
		//create RestTemplate class object
		RestTemplate template = new RestTemplate();
		
		//invoke the end point using exchange method
		ResponseEntity<String> responseEntity = template.exchange(url, HttpMethod.GET,null,String.class);
		return responseEntity;
	}
	
}

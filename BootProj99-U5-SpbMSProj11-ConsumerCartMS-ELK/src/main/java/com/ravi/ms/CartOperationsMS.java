 package com.ravi.ms;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.client.IBillingMSInvokerClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cart-api")
@Slf4j
public class CartOperationsMS {
	
	@Autowired
	private IBillingMSInvokerClient client;
	
	@GetMapping("/cart/{user}")
	public ResponseEntity<String> cartOperations(@PathVariable String user){
		
		log.debug("start of cartOperations() method");
		//add items to cart
		String [] items=new String[] {"shirt","trauser"};
		
		//invoke target method
		ResponseEntity<String> resp = client.invokeGenerateBillAmount();
		
		log.debug("invoking the target MS Operations");
		//prepare final message having both outputs
		String finalMessage="Items added to cart are: "+Arrays.toString(items)+"..."+resp.getBody()+"..."+client.invokeShowWishMessage(user).getBody();
		
		log.debug("final output is generated");
		//return the ResponseEntity object
		return new ResponseEntity<String>(finalMessage,HttpStatus.OK);
		
	}

}

package com.ravi.ms;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.client.BillingMSInvokerClient;

@RestController
@RequestMapping("/cart-api")
public class CartOperationsMS {
	
	@Autowired
	private BillingMSInvokerClient client;
	
	@GetMapping("/cart")
	public ResponseEntity<String> cartOperations(){
		
		//add items to cart
		String [] items=new String[] {"shirt","trauser"};
		
		//invoke target method
		ResponseEntity<String> resp = client.invokeGenerateBillAmount();
		
		//prepare final message having both outputs
		String finalMessage="Items added to cart are: "+Arrays.toString(items)+"..."+resp.getBody();
		
		//return the ResponseEntity object
		return new ResponseEntity<String>(finalMessage,HttpStatus.OK);
		
	}

}

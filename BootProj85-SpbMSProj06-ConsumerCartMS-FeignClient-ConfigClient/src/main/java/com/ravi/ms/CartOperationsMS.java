 package com.ravi.ms;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.client.IBillingMSInvokerClient;

@RestController
@RequestMapping("/cart-api")
@RefreshScope
public class CartOperationsMS {
	
	@Autowired
	private IBillingMSInvokerClient client;
	
	@Value("${db.user}")
	private String user;
	
	@Value("${db.pwd}")
	private String pwd;
	
	@GetMapping("/cart/{user}")
	public ResponseEntity<String> cartOperations(@PathVariable String user){
		
		//add items to cart
		String [] items=new String[] {"shirt","trauser"};
		
		//invoke target method
		ResponseEntity<String> resp = client.invokeGenerateBillAmount();
		
		//prepare final message having both outputs
		String finalMessage="Items added to cart are: "+Arrays.toString(items)+"..."+resp.getBody()+"..."+client.invokeShowWishMessage(user)+"..."+user+"..."+pwd;
		
		//return the ResponseEntity object
		return new ResponseEntity<String>(finalMessage,HttpStatus.OK);
		
	}

}

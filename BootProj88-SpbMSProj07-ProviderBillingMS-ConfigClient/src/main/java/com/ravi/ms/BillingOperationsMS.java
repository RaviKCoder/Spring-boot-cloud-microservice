package com.ravi.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationsMS {
	
	@Value("${spring.application.instance-id}")
	private String instance_id;
	
	@Value("${db.user}")
	private String duser;
	
	@Value("${db.pwd}")
	private String pwd;
	 
	
	@GetMapping("/doBill")
	public ResponseEntity<String> generateBillAmount(){
		
		//generate the bill amount
		double bamount = new Random().nextDouble(40000);
		
		//show the bill
		return new ResponseEntity<String>("Bill Amount is :"+bamount+"..."+instance_id+"..."+duser+"..."+pwd,HttpStatus.OK);
	}
	
	@GetMapping("/wish/{user}")
	public ResponseEntity<String> showWishMessage(@PathVariable String user){
		return new ResponseEntity<String>("Good evening: "+user,HttpStatus.OK);
	}

}

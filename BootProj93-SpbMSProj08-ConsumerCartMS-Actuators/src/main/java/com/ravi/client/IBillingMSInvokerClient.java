package com.ravi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ProviderBillingMS")
public interface IBillingMSInvokerClient {

	@GetMapping("/billing-api/doBill")
	public ResponseEntity<String> invokeGenerateBillAmount();

	@GetMapping("/billing-api/wish/{user}")
	public ResponseEntity<String> invokeShowWishMessage(@PathVariable String user);
}

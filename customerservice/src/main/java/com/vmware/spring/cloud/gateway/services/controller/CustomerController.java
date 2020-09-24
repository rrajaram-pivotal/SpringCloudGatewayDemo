package com.vmware.spring.cloud.gateway.services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("/message")
	public String getCustomerMessage() {
		return "Hello from customer!";
	}

}

package com.vmware.spring.cloud.gateway.services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/employee")
public class EmployeeController {
	
	@GetMapping("/message")
	public String getEmployeeMessage() {
		return "Hello from employee!";
	}


}

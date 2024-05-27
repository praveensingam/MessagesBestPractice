package com.sp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {//We use this approach when we have less no of messages to be declared

	@Value("${quote}")
	String quotation;
	
	@Value("${advice}")
	String advice;
	
	@GetMapping("/quotations")
	public String quotes() {
	System.out.println("Modification occured in working tree quotes");	
		return quotation;
		
	}
	
	@GetMapping("/advice")
	public String advices() {
		System.out.println("Modified in Working tree advices");
		return advice;
	}

}

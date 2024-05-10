package com.sp.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.util.AppConstants;
import com.sp.util.AppProperties;

@RestController
public class MessageController {

	@Autowired
	private AppProperties appProperties;

	@GetMapping("/welcome")
	public String welcome() {

//		Map<String, String> messages = appProperties.getMessages();
//		
//		return messages.get("wlcmMessage");

		return appProperties.getMessages().get(AppConstants.WELCOME_MSG_KEY); // To avoid hard coding string literals
																				// with help of AppConstants
	}

	@GetMapping("/greet")
	public String greet() {

		return appProperties.getMessages().get(AppConstants.GREET_MSG_KEY);
	}

}

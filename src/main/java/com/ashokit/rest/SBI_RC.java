package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBI_RC {

	@GetMapping
	public String welcome() {
		return "Welcome to SBI App !!";
	}
	
	@GetMapping("/about")
	public String abt() {
		return "Learn here lead anywhere...!!";
	}
	
	@GetMapping("/balance")
	public String balance() {
		return "Your Current balance is : 204100.07";
	}
	
	@GetMapping("/transfer")
	public String trans() {
		return "Money transfer successfully !!";
	}
}

package com.whatsapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsAppController {
	
	@GetMapping("/Signin")
	public String Signinpage() {
		return "Welcome to Signin page";
	}
	
	@GetMapping("/Landingpage/{username}")
	public String Landingpage(@PathVariable("username") String username) {
		return "Welcome to Landing page "+username;
	}

}

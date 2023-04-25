package com.twitterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterLogin {

	@GetMapping("/login")
	public String login()
	{
		return "Login successful";
	}
}

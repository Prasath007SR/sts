package com.example.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController
{
	@RequestMapping("/{var}")
	public String Hello(@PathVariable String var)
	{
		return "Hello "+var;
	}
}

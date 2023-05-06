package com.example.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.AppModel;
import com.example.app.service.AppService;

@RestController
public class AppController
{
	@Autowired
	AppService as;
	@GetMapping("/student")
	public List<AppModel> getAllDetails()
	{
		return as.findAll();
	}
	@GetMapping("/student/{Id}")
	public Optional<AppModel> getAllDetails1(@PathVariable int Id)
	{
		return as.getAllDetails1(Id);
	}
	@PostMapping("/students")
	public AppModel getAllDetalsById1(@RequestBody AppModel Id)
	{
		return as.getAllDetailsById1(Id);
	}
}

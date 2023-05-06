package com.example.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.AppModel;
import com.example.app.service.AppService;

@RestController
public class AppController
{
	@Autowired
	AppService as;
	@PostMapping("/")
	public String getAllDetails(@RequestBody AppModel id)
	{
		AppModel am=as.getAllDetails(id);
		String result="false";
		if(am!=null)
		{
			result="true";
		}
		return result;
	}
	@GetMapping("/")
	public List<AppModel> getAllDetails1()
	{
		return as.findAll();
	}
	@GetMapping("/{id}")
	public Optional<AppModel> getDetailsById(@PathVariable int id)
	{
		return as.getDetailsById(id);
	}
	@PutMapping("/{id}")
	public AppModel getDetailsById1(@RequestBody AppModel id)
	{
		return as.getDetailsById1(id);
	}
	@DeleteMapping("/{id}")
	public String getDetailsById2(@PathVariable int id)
	{
		as.getDetailsById2(id);
		return "details deleted";
	}
}

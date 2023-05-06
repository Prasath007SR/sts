package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@PutMapping("/students")
	public AppModel getAllDetails(@RequestBody AppModel Id)
	{
		return as.getAllDetails(Id);
	}
	@DeleteMapping("/student/{Id}")
    public String deleteDetails(@PathVariable int Id)
    {
    	as.deleteDetails(Id);
    	return "deleted";
    }
}

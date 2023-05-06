package com.example.app.controller;

import java.util.List;

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
	@GetMapping("/fetchemployeedetails/{employeeId}/{employeeName}")
	public List<AppModel> fetchStudentsByDepartment(@PathVariable 
			int employeeId,@PathVariable String employeeName)
	{
		return as.getStudentsByDepartment(employeeId, employeeName);
	}
}

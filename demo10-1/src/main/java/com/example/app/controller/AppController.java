package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.AppModel;
import com.example.app.service.AppService;

@RestController
public class AppController
{
	@Autowired
	AppService as;
	@GetMapping("/get")
	public List<AppModel> getAllDetails()
	{
		return as.findAll();
	}
	//fetchStudentByNamePrefix?prefix=R
	@GetMapping("/fetchStudentByNamePrefix")
	public List<AppModel> fetchStudentsByNamePrefix(@RequestParam String prefix)
	{
		return as.fetchStudentsByNamePrefix(prefix);
	}
	@GetMapping("/fetchStudentByNameSufix")
	public List<AppModel> fetchStudentsByNameSufix(@RequestParam String sufix)
	{
		return as.fetchStudentsByNameSufix(sufix);
	}
	@GetMapping("/fetchStudentByDepartment")
	public List<AppModel> fetchStudentsByDepartment(@RequestParam String dept)
	{
		return as.fetchStudentsByDepartment(dept);
	}
	
	@GetMapping("/fetchStudentsByDepartment/{dept}/{name}")
	public List<AppModel> fetchStudentsByDepartment(@PathVariable 
			String dept,@PathVariable String name)
	{
		return as.getStudentsByDepartment(dept, name);
	}
	@DeleteMapping("/deleteStudentByName/{name}")
	public String deleteStudentByName(@PathVariable String name)
	{
	int result=as.deleteStudentByName(name);
	if(result>0)
		return "Student record deleted";
	else
		return "Problem occured while deleting";
	}
	@PutMapping("/updateStudentByName/{department}/{name}")
	public String updateStudentByName(@PathVariable String department,@PathVariable String name)
	{
	int result=as.updateStudentByName(department,name);
	if(result>0)
		return "Student record updated";
	else
		return "Problem occured while updated";
	}
}

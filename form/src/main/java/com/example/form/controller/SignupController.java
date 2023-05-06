package com.example.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.model.SignupModel;
import com.example.form.service.SignupService;

@RestController
public class SignupController
{
	@Autowired
	SignupService ss;
	@GetMapping("/sortSignupModel/{field}")
	public List<SignupModel> sortSignupModel(@PathVariable String field)
	{
		return ss.sortSignupModel(field);
	}
	@GetMapping("/pagingSignupModel/{offset}/{pageSize}")
	public List<SignupModel> pagingSignupModel(@PathVariable int offset,@PathVariable int pageSize)
	{
		return ss.pagingSignupModel(offset, pageSize);
	}
}

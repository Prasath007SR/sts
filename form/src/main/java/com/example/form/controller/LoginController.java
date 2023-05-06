package com.example.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.model.LoginModel;
import com.example.form.service.LoginService;

@RestController
public class LoginController
{
	@Autowired
	LoginService ls;
	@GetMapping("/sortLoginModel/{field}")
	public List<LoginModel> sortLoginModel(@PathVariable String field)
	{
		return ls.sortLoginModel(field);
	}
	@GetMapping("/pagingLoginModel/{offset}/{pageSize}")
	public List<LoginModel> pagingLoginModel(@PathVariable int offset,@PathVariable int pageSize)
	{
		return ls.pagingLoginModel(offset, pageSize);
	}
	@GetMapping("/pagingLoginModel/{offset}/{pageSize}/{field}")
	public List<LoginModel> pagingLoginModel1(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return ls.pagingLoginModel1(offset,pageSize,field);
	}
}

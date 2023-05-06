package com.example.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.form.model.LoginModel;
import com.example.form.repository.LoginRepository;

@Service
public class LoginService
{
	@Autowired
	LoginRepository lr;

	public List<LoginModel> sortLoginModel(String field)
	{
		return lr.findAll(Sort.by(Direction.DESC,field));
	}

	public List<LoginModel> pagingLoginModel(int offset, int pageSize)
	{
		Page<LoginModel> paging=lr.findAll(PageRequest.of(offset, pageSize));
		return paging.getContent();
	}

	public List<LoginModel> pagingLoginModel1(int offset, int pageSize, String field)
	{
		Page<LoginModel> paging=lr.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
		return paging.getContent();
	}
}

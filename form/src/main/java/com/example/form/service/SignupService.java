package com.example.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.form.model.SignupModel;
import com.example.form.repository.SignupRepository;

@Service
public class SignupService
{
	@Autowired
	SignupRepository sr;

	public List<SignupModel> sortSignupModel(String field)
	{
		return sr.findAll(Sort.by(Direction.DESC,field));
	}

	public List<SignupModel> pagingSignupModel(int offset, int pageSize)
	{
		Page<SignupModel> paging=sr.findAll(PageRequest.of(offset, pageSize));
		return paging.getContent();
	}
}

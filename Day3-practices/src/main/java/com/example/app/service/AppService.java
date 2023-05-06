package com.example.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.AppModel;
import com.example.app.repository.AppRepository;

@Service
public class AppService
{
	@Autowired
	AppRepository ar;

	public List<AppModel> findAll()
	{
		return ar.findAll();
	}
	public Optional<AppModel> getAllDetails1(int Id)
	{
		return ar.findById(Id);
	}
	public AppModel getAllDetailsById1(AppModel Id)
	{
		return ar.save(Id);
	}
}

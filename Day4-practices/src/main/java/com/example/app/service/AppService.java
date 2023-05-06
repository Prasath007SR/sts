package com.example.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.AppModel;
import com.example.app.repository.AppRepository;

@Service
public class AppService
{
	@Autowired
	AppRepository ar;

	public AppModel getAllDetails(AppModel Id)
	{
		return ar.save(Id);
	}
	public void deleteDetails(int Id)
	{
		 ar.deleteById(Id);
	}
}

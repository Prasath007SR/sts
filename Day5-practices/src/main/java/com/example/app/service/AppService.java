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
	public AppModel getAllDetails(AppModel id)
	{
		return ar.save(id);
	}
	public List<AppModel> findAll()
	{
		return ar.findAll();
	}
	public Optional<AppModel> getDetailsById(int id)
	{
		return ar.findById(id);
	}
	public AppModel getDetailsById1(AppModel id)
	{
		return ar.save(id);
	}
	public void getDetailsById2(int id)
	{
		ar.deleteById(id);
	}
}

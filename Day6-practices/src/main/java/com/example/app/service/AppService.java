package com.example.app.service;

import java.util.List;

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
	public List<AppModel> getStudentsByDepartment(int employeeId,String employeeName)
	{
		return ar.getStudentsByDepartment(employeeId, employeeName);
	}
}

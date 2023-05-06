package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.AppModel;
import com.example.app.repository.AppRepository;
import jakarta.transaction.Transactional;

@Service
public class AppService
{
	@Autowired
	AppRepository ar;
	public List<AppModel> fetchStudentsByNamePrefix(String prefix)
	{
		return ar.findByNameStartingWith(prefix);
	}
	public List<AppModel> fetchStudentsByNameSufix(String sufix)
	{
		return ar.findByNameEndingWith(sufix);
	}
	public List<AppModel> fetchStudentsByDepartment(String dept)
	{
		return ar.findByDepartment(dept);
	}
	public List<AppModel> getStudentsByDepartment(String dept,String name)
	{
		return ar.getStudentsByDepartment(dept, name);
	}
	@Transactional
	public int deleteStudentByName(String name)
	{
		return ar.deleteStudentByName(name);
	}
	public List<AppModel> findAll()
	{
		return ar.findAll();
	}
	@Transactional
	public int updateStudentByName(String department,String name)
	{
		return ar.updateStudentByName(department,name);
	}
}

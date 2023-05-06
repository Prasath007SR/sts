package com.example.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.app.model.AppModel;

@Repository
public interface AppRepository extends JpaRepository<AppModel,Integer>
{
	@Query("Select a from AppModel a where a.employeeId=?1 and a.employeeName=?2")
	public List<AppModel> getStudentsByDepartment(int employeeId,String employeeName);
}

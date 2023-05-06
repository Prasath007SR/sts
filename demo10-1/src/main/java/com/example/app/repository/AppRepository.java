package com.example.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.app.model.AppModel;

@Repository
public interface AppRepository extends JpaRepository<AppModel,Integer>
{
	//positional parameter
	@Query("Select a from AppModel a where a.department=?1 and a.name=?2")
	public List<AppModel> getStudentsByDepartment(String dept,String name);
	
	//named parameter
	@Query("Select a from AppModel a where a.department=:dept")
	public List<AppModel> getStudentsByDepartment(String dept);
	
	//DML
	@Modifying
	@Query("delete from AppModel a where a.name=?1")
	public int deleteStudentByName(String name);
	
	@Modifying
	@Query("update AppModel a set a.department=?1 where a.name=?2")
	public int updateStudentByName(String department,String name);
	
	@Query(value="select * from Student  s where  s.email= ?1",nativeQuery=true)
	public List<AppModel> fetchStudentByMail(String  mail);
	
	List<AppModel>findByNameStartingWith(String prefix);
	List<AppModel>findByNameEndingWith(String sufix);
	List<AppModel>findByDepartment(String dept);
}

package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppModel
{
	@Id
	private int Id;
	private String studentName;
	private String email;
	private int age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "AppModel [Id=" + Id + ", studentName=" + studentName + ", email=" + email + ", age=" + age + "]";
	}
	
}

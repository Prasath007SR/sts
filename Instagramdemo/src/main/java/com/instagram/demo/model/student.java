package com.instagram.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
	private int regno;
	private String name;
	private String department;
	private String email;
	private String blooggrp;
	private String age;
	public String getBlooggrp() {
		return blooggrp;
	}
	public void setBlooggrp(String blooggrp) {
		this.blooggrp = blooggrp;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	student(){}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

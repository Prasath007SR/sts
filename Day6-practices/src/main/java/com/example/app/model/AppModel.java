package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppModel
{
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private long employeeMobile;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(long employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	@Override
	public String toString() {
		return "AppModel [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeMobile=" + employeeMobile + "]";
	}
	
}

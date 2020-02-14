package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee {

	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getEmpname() {
		return getEmpname();
	}
	public void setEmpname(String Empname) {
	}
	public String getEmppassword() {
		return getEmppassword();
	}
	public void setEmppassword(String Emppassword) {
	}
	public boolean isEnable() {
		return true;
	}
	
	public void setEnable(boolean Enable) {
		this.Enable=Enable;
	}
	public String getRoles() {
		return Roles;
	}
	public void setRole(String Roles)
	{
		this.Roles=Roles;
	}

	@Transient
	private boolean Enable;
	private String Roles;
		
		
	
	}


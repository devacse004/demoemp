package com.example.demo.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="EmployeeDetails")

public class EmployeeDB {
  @Id
  private String Emp_id;
   private String Emp_name;
  public EmployeeDB(String emp_id2, String emp_name2) {
	// TODO Auto-generated constructor stub
}
public String getEmp_id() {
	return Emp_id; 	  
  }
  public void setEmp_id( String Emp_id) {
		this.Emp_id=Emp_id;
  }
public String getEmp_name() {
	return Emp_name;
}
public void setEmp_name(String Emp_name) {
	this.Emp_name=Emp_name;
}
public static List<EmployeeDB> findAll() {
	// TODO Auto-generated method stub
	return null;
}
public static EmployeeDB findByEmp_id(String emp_id2) {
	// TODO Auto-generated method stub
	return null;
}
public List<EmployeeDB> getAllEmployeeDB() {
	// TODO Auto-generated method stub
	return null;
}
public Optional<EmployeeDB> getEmployeeDBById(String c_id) {
	// TODO Auto-generated method stub
	return null;
}
public String deleteEmployeeDB(Object emp_id2) {
	// TODO Auto-generated method stub
	return null;
}
public String addNewEmployee(Object emp) {
	// TODO Auto-generated method stub
	return null;
}
  
}

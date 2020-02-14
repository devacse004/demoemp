package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeDBService;
import com.example.demo.domain.EmployeeDB;

@RestController

public class EmployeeDBController {

	@Autowired
	private EmployeeDBService employeeDBService;

	public EmployeeDBService getEmployeeDBService() {
		return employeeDBService;
	}

	public void setEmployeeDBService(EmployeeDBService employeeDBService) {
		this.employeeDBService = employeeDBService;
	}
	 @RequestMapping("/create")
	 public String create( @RequestParam String Emp_id, @RequestParam String Emp_name) {
		 EmployeeDB e= employeeDBService.create(Emp_id, Emp_name);
		return e.toString();
	 }

	 @RequestMapping("/get")
	 public List<EmployeeDB> getEmployeeDB(@RequestParam String Emp_id) {
		 return employeeDBService.getByEmp_id(Emp_id);
	 }
	 @RequestMapping("/getAll")
	 public List<EmployeeDB> getAll(){
		return EmployeeDBService.getAll();
		
	 }
	 @RequestMapping("/update")
	 public String update( @RequestParam String Emp_id, @RequestParam String Emp_name) {

		 EmployeeDB e= employeeDBService.update(Emp_id, Emp_name);
		return e.toString();
	 }
	 @RequestMapping("/delete")
	 public String delete( @RequestParam String Emp_id) {
		 employeeDBService.delete(Emp_id);
		return "Delete"+ Emp_id;
	 }
	 @RequestMapping("/deleteAll")
	 public String deleteAll() {
		 employeeDBService.deleteAll();
		return "Deleted all records";	 
	 
	 }
}

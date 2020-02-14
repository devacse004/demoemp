package com.example.demo.Resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.EmployeeDB;

@RestController

@RequestMapping("api/EmployeeDB")
@Api(value = "CompanyControllerAPI")

//@RequestMapping("/")

public class EmployeeDBController {
	@Autowired
	private EmployeeDB employeeDB;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<EmployeeDB> getAllCompany()
	{
		return employeeDB.getAllEmployeeDB();
	} 	
	@RequestMapping(value = "/admin/{c_id}", method = RequestMethod.GET)
	public Optional <EmployeeDB> getCompanyById(@PathVariable String Emp_id) {
			
		Optional <EmployeeDB> u;
			return u=  employeeDB.getEmployeeDBById(Emp_id);
	

}

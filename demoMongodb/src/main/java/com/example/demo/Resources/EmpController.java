package com.example.demo.Resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.StringOperators.Concat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.EmployeeDB;

@RequestMapping("Empname/employee")

@RestController
public class EmpController {
	@Autowired
	private EmployeeDB employeeDB ;
	private Object Emp_id;
	private Object Emp;
	
	
	@GetMapping(value = "/")
	public List<EmployeeDB> getAllEmployee()
	{
		
		return employeeDB .getAllEmployeeDB ();
	
}
	@RequestMapping(value = "/Empname/{emp_id}", method = RequestMethod.GET)
	@ApiOperation(value="Find employee by ID",notes="Get employee by specfic employee",response = Concat.class)
	//public ResponseEntity<Object> getEmployeeById(@PathVariable String emp_id,@RequestBody EmployeeDB emp) {
		public Optional<EmployeeDB>getEmployeeById(@ApiParam(value="The given is get the detials about employeeDB")@PathVariable String Emp_id)	
		{
		
		//Optional <Employee> u=  
		return employeeDB.getEmployeeDBById(Emp_id);
		}

	@RequestMapping(value="/admin/create",method=RequestMethod.POST)
	@ApiOperation(value="Insert a new employee",notes="Give the detail about employee",response = Concat.class)
	public String addNewEmployee(EmployeeDB emp)
	{	
		System.out.println(emp);
	
		return employeeDB.addNewEmployee(Emp);
		
		 
	}
	@RequestMapping(value="/admin/delete/{emp_id}",method=RequestMethod.GET)
	@ApiOperation(value="Delete employee by ID",notes="Delete employee by specfic employee id",response = Concat.class)
	public String deleteEmployee(@PathVariable String emp_id)
	{
		return employeeDB.deleteEmployeeDB(Emp_id);
		
	}
	@GetMapping(value="/admin/update/{Emp_id}")
	public String updateEmployee(@RequestBody EmployeeDB emp)
	{
		
		employeeDB.deleteEmployeeDB(Emp);
		 return "Upadte";
		
	
			
	}

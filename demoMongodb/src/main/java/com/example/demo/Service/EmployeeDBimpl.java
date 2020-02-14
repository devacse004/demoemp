package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import EmployeeDB.EmployeeDB;

@Service
public interface EmployeeDBimpl {
	
	@Autowired 
	private  MongoTemplate mtemp;
	
	@Autowired 
	private Employee_Resp empres;

public default Optional <EmployeeDB> getEmployeeDBById(String emp_id)
{
	 	return empres.findById(emp_id);
	 	
	 
}
public default List<EmployeeDB>getAllEmployeeDB()
{
	return mtemp.findAll(EmployeeDB.class);
}

public default EmployeeDB addNewEmployeeDB(EmployeeDB com)
{

	return mtemp.save(com);
}
			
}

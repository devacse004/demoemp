package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeDBRepository;
import com.example.demo.domain.EmployeeDB;

@Service

public class EmployeeDBService {

	@Autowired
	private EmployeeDBRepository employeeDBRepository;
	
	//create operation 
	public EmployeeDB create(String Emp_id, String Emp_name) {
		return employeeDBRepository.save(new EmployeeDB(Emp_id,Emp_name));
	}
	//Retrieve operation
	public static List<EmployeeDB> getAll(){
		return EmployeeDB.findAll();
	}
	public List<EmployeeDB> getByEmp_id(String Emp_id) {
		return employeeDBRepository.findAll();
		
	}
	
	//update operation
	public EmployeeDB update(String Emp_id, String Emp_name) {
		Optional<EmployeeDB> e=employeeDBRepository.findById(Emp_id);
		
		return employeeDBRepository.save(e);
	}
	//delete operation
public void deleteAll(){
	employeeDBRepository.deleteAll();
}
public void delete(String emp_id) {
	// TODO Auto-generated method stub
	
}


}
}

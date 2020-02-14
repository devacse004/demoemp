package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.EmployeeDB;

@Repository

public interface EmployeeDBRepository extends MongoRepository<EmployeeDB, String> {

	EmployeeDB save(Optional<EmployeeDB> e);

}

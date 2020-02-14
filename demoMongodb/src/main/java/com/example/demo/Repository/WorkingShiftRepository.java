package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.WorkingShift;

@Repository

public interface WorkingShiftRepository extends MongoRepository <WorkingShift, String> {

}

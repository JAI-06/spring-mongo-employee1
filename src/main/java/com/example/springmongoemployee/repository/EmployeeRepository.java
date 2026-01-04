package com.example.springmongoemployee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.springmongoemployee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}

package com.example.emp;

import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepo extends CrudRepository<EmployeeData,Integer> {

}

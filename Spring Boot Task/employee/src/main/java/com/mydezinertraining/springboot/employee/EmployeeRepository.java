package com.mydezinertraining.springboot.employee;

import com.mydezinertraining.springboot.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

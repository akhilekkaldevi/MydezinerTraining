package com.mydezinertraining.springboot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;

@org.springframework.stereotype.Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void updateEmployee(Employee employees){
        employeeRepository.save(employees);
    }

    public List<Employee> getEmployee() {
        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

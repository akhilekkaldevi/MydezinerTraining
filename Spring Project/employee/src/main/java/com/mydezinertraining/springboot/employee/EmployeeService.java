package com.mydezinertraining.springboot.employee;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class EmployeeService implements Service {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void updateEmployeeRepository(Employee employees){
        employeeRepository.save(employees);
    }

    public List<Employee> getEmployeeRepository() {
        return employeeRepository.findAll();
    }

    public void deleteEmployeeRepository(Long id) {
        employeeRepository.deleteById(id);
    }
}

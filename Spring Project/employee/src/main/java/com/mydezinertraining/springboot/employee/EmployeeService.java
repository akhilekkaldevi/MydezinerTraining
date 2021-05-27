package com.mydezinertraining.springboot.employee;

import com.mydezinertraining.springboot.employee.EmployeeRepository;
import com.mydezinertraining.springboot.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void setEmployeeRepository(Employee employees){
        employeeRepository.save(employees);
    }

    public List<Employee> getEmployeeRepository() {
        return employeeRepository.findAll();
    }

    public void deleteEmployeeRepository(Long id) {
        employeeRepository.deleteById(id);
    }
}

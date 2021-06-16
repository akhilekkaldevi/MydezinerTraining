package com.mydezinertraining.springboot.employee;

import java.util.List;

public interface IEmployeeService {

    void updateEmployee(Employee employees);

    List<Employee> getEmployee();

    void deleteEmployee(Long id);
}

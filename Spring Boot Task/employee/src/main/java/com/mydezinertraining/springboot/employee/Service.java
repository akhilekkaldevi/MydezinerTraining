package com.mydezinertraining.springboot.employee;

import java.util.List;

public interface Service {

    public void updateEmployeeRepository(Employee employees);

    public List<Employee> getEmployeeRepository();

    public void deleteEmployeeRepository(Long id);
}

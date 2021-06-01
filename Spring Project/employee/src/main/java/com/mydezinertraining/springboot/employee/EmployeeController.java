package com.mydezinertraining.springboot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee>  getEmployeeService(){
        return employeeService.getEmployee();
    }

    @PostMapping("/employee")
    public void addEmployeeService(@RequestBody Employee employees ){
        employeeService.updateEmployee(employees);
    }

    @PutMapping("/employee/{id}")
    public void updateEmployeeService(@RequestBody Employee employees ,@PathVariable Long id){
        employeeService.updateEmployee(employees);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployeeService(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}

package com.mydezinertraining.springboot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee>  getEmployeeService(){
        return employeeService.getEmployeeRepository();
    }

    @PostMapping("/employee")
    public void setEmployeeService(@RequestBody Employee employees ){
        employeeService.setEmployeeRepository(employees);
    }

    @PutMapping("/employee/{id}")
    public void updateEmployeeService(@RequestBody Employee employees ,@PathVariable Long id){
        employeeService.setEmployeeRepository(employees);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployeeService(@PathVariable Long id){
        employeeService.deleteEmployeeRepository(id);
    }
}

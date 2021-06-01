package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService repo1;
@GetMapping("/emp")
public List<Employee> getAllEmployees()
{
	
	return repo1.getAllEmployees();
}
@GetMapping("/emp/{id}")
private Employee getEmployee(@PathVariable("id")int id)
{
	return repo1.getEmployeeById(id);
	
}
@GetMapping("/emp1/{id}")
private void deleteEmployee(@PathVariable("id")int id)
{
	repo1.delete(id);
}
@PostMapping("/employees")
private void saveEmployee(@RequestBody Employee emp)
{
	repo1.Save(emp);
}
@PutMapping("/employes")
private void update(@RequestBody Employee emp)
{
	repo1.Save(emp);
}
}

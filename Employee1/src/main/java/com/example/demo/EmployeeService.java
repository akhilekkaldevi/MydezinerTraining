package com.example.demo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
@Service
public class EmployeeService {
@Autowired
EmployeeRepo repo;
public List<Employee> getAllEmployees()
{
	List<Employee>emp=new ArrayList<Employee>();
	repo.findAll().forEach(emp1->emp.add(emp1));
	return emp;
}
public Employee getEmployeeById(int id)
{
	return repo.findById(id).get();
}
public void Save(Employee emp)
{
	repo.save(emp);
}
public void delete(int id)
{
	repo.deleteById(id);
}
public void update(Employee emp,int id)
{
	repo.save(emp);
}
}

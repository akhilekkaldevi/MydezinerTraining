package com.example.demo;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Controller;

@Entity
@Controller
public class Employee {
	@Id
	@Column
private int id;
	@Column
private String name;
	@Column
private int salary;
	@Column
private String companyname;
public Employee()
{
	
}
public Employee(int id, String name, int salary, String companyname) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.companyname = companyname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", companyname=" + companyname + "]";
}

}

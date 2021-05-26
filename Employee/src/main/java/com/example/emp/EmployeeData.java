package com.example.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class EmployeeData {
	@Id
private int empid;
private String empname;
private int empsalary;
private String empcompanyname;
public EmployeeData()
{
	
}
public EmployeeData(int empid, String empname, int empsalary, String empcompanyname) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empsalary = empsalary;
	this.empcompanyname = empcompanyname;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(int empsalary) {
	this.empsalary = empsalary;
}
public String getEmpcompanyname() {
	return empcompanyname;
}
public void setEmpcompanyname(String empcompanyname) {
	this.empcompanyname = empcompanyname;
}
@Override
public String toString() {
	return "EmployeeData [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empcompanyname="
			+ empcompanyname + "]";
}

}

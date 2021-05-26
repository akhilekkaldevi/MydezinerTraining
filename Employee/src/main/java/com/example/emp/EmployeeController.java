package com.example.emp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
@RequestMapping("/")
public List<EmployeeData> employee()
{
	List<EmployeeData> empdata=new ArrayList<EmployeeData>();
	empdata.add(new EmployeeData(512,"Saiteja",5000,"HinshistuPvtLtd"));
	empdata.add(new EmployeeData(513,"Abhay",5000,"HinshistuPvtLtd"));
	empdata.add(new EmployeeData(514,"Rajesh",5000,"HinshistuPvtLtd"));
	empdata.add(new EmployeeData(515,"Saikiran",5000,"OptivalSolutions"));
	repo.saveAll(empdata);
	return empdata;

}
}

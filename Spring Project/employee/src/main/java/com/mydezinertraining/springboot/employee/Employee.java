package com.mydezinertraining.springboot.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Employee {
    @Id
    @Column(name="emp_id")
    private Long id;
    @Column(name="emp_name")
    private String employeeName;
    @Column(name="emp_description")
    private String designation;
    @Column(name="emp_dob")
    private String dob;
    @Column(name="emp_doj")
    private String doj;

    public Employee() {
    }

    public Employee(Long id, String employeeName, String designation, String dob, String doj) {
        this.id = id;
        this.employeeName = employeeName;
        this.designation = designation;
        this.dob = dob;
        this.doj = doj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }
}

package com.mydezinertraining.springboot.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
    @Id
    @Column(name="emp_id")
    private Long id;
    @Column(name="emp_name")
    private String employeeName;
    @Column(name="emp_description")
    private String designation;
    @Column(name="emp_date_of_birth")
    private String dateOfBirth;
    @Column(name="emp_date_of_joining")
    private String dateOfJoining;

    public Employee() {
    }

    public Employee(Long id, String employeeName, String designation, String dateOfBirth, String dateOfJoining) {
        this.id = id;
        this.employeeName = employeeName;
        this.designation = designation;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}

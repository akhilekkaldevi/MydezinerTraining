package Generics;

public class Employee {
	public int empId;
	public String empName;
	public int empSalary;
	public String empDesignation;

	public Employee(int empId, String empName, int empSalary, String empDesignation) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "Employee empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesignation="
				+ empDesignation;
	}
	
}

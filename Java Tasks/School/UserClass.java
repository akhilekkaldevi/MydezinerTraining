package School;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserClass extends SchoolDTO {
	private Scanner sc = new Scanner(System.in);

	public void runProgram() {
		String out="";
		do {
			SchoolDTO schoolDTO = new SchoolDTO();
			SchoolDAO schoolDAO = schoolDTO.getObject();
			Employee e1 = new Employee(1, "Rajesh", 20000, "Management", "Exam");
			Employee e2 = new Employee(2, "kumar", 25000, "teacher", "Electroncis", 2);
			Student s1 = new Student(1, "Abhinay", "10071999", "ECE");
			Student s2 = new Student(2, "Abhi", "10071998", "CSE");
			schoolDAO.addStudent(s1);
			schoolDAO.addStudent(s2);
			schoolDAO.addEmployee(e1);
			schoolDAO.addEmployee(e2);
			System.out.println("press 1 to add student details");
			System.out.println("press 2 to get student details");
			System.out.println("press 3 to add employee details");
			System.out.println("press 4 to get employee details");
			System.out.println("press 5 to Search for a student");
			System.out.println("press any other number greater than 5 to exit");
			int choice;
			while (true) {
				try {
					choice = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input Please Try Again ");
					System.out.print("choice: ");
					sc.next();
				}
			}
			switch (choice) {
			case 1:
				System.out.println("ENTER STUDENT DETAILS");
				System.out.println("enter student id");
				int StudentId = sc.nextInt();
				sc.nextLine();
				System.out.println("enter student name");
				String StudentName = sc.nextLine();
				System.out.println("enter student dob");
				String dob = sc.nextLine();
				System.out.println("enter student branch");
				String branch = sc.nextLine();
				Student s = new Student(StudentId, StudentName, dob, branch);
				schoolDAO.addStudent(s);
				System.out.println("Student Added Successfully");
				break;
			case 2:
				System.out.println("Student details are");
				System.out.println(getStudentList());
				break;
			case 3:
				System.out.println("ENTER EMPLOYEE DETAILS");
				System.out.println("enter employee id");
				int empId = sc.nextInt();
				sc.nextLine();
				System.out.println("enter employee name");
				String empName = sc.nextLine();
				System.out.println("enter employee salary");
				int sal = sc.nextInt();
				sc.nextLine();
				System.out.println("enter designation/area of work(teacher or Management)");
				String des = sc.nextLine();
				if (des.equalsIgnoreCase("teacher")) {
					System.out.println("enter domain");
					String domain = sc.nextLine();
					System.out.println("enter experience");
					int experience = sc.nextInt();
					sc.nextLine();
					Employee e = new Employee(empId, empName, sal, des, domain, experience);
					schoolDAO.addEmployee(e);
				} else if (des.equalsIgnoreCase("management")) {
					System.out.println("enter branch of employee(exam branch/scholarship branch)");
					String branchtype = sc.nextLine();
					Employee e = new Employee(empId, empName, sal, des, branchtype);
					schoolDAO.addEmployee(e);
				} else {
					System.out.println("Enter valid designation\\n");
					continue;
				}
				System.out.println("Employee Added Successfully");
				break;
			case 4:
				System.out.println("Employee details are");
				System.out.println(getEmployeeList());
				break;
			case 5:

				System.out.println("press 1 to search by id\n press 2 to search by name");
				int temp = sc.nextInt();
				if (temp == 1) {
					System.out.println("Enter Id");
					int id = sc.nextInt();
					System.out.println(schoolDAO.searchStudent(id));
				} else if (temp == 2) {
					System.out.println("Enter Name");
					String name = sc.nextLine();
					System.out.println(schoolDAO.searchStudent(name));
				} else {
					System.out.println("Enter valid designation\\n");
					continue;
				}
				break;
			default:
				System.out.println("Enter Y to continue or enter N to Exit ");
				out = sc.next();
			}
			
		} while (out.equalsIgnoreCase("y"));
		System.out.println("Thank You");
	}
}

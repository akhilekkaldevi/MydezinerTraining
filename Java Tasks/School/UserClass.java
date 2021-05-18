package School;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserClass extends SchoolDTO {
	private Scanner sc = new Scanner(System.in);

	public void runClass() {
		while (true) {
			SchoolDTO schoolDTO = new SchoolDTO();
			SchoolDAO schoolDAO = schoolDTO.schoolDAO();
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
			System.out.println("press any other number greater than 4 to exit");
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
			if (choice == 1) {
				System.out.println("ENTER STUDENT DETAILS");
				System.out.println("enter student id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("enter student name");
				String name = sc.nextLine();
				System.out.println("enter student dob");
				String dob = sc.nextLine();
				System.out.println("enter student branch");
				String branch = sc.nextLine();
				Student s = new Student(id, name, dob, branch);
				schoolDAO.addStudent(s);
				System.out.println("Student Added Successfully");
			} else if (choice == 2) {
				System.out.println("Student details are");
				System.out.println(getStudentList());
			} else if (choice == 3) {
				System.out.println("ENTER EMPLOYEE DETAILS");
				System.out.println("enter employee id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("enter employee name");
				String name = sc.nextLine();
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
					Employee e = new Employee(id, name, sal, des, domain, experience);
					schoolDAO.addEmployee(e);
				} else if (des.equalsIgnoreCase("management")) {
					System.out.println("enter branch of employee(exam branch/scholarship branch)");
					String branch = sc.nextLine();
					Employee e = new Employee(id, name, sal, des, branch);
					schoolDAO.addEmployee(e);
				} else {
					System.out.println("Enter valid designation\\n");
					continue;
				}
				System.out.println("Employee Added Successfully");

			} else if (choice == 4) {
				System.out.println("Employee details are");
				System.out.println(getEmployeeList());
			} else {
				break;
			}
		}
	}
}

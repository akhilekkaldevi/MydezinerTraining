package School;

import java.util.ArrayList;

public class SchoolDTO {

	private static ArrayList<Student> studentList =new ArrayList<Student>();

	private static ArrayList<Employee> employeeList=new ArrayList<Employee>();

//ABSTRACTION

	public SchoolDAO schoolDAO() {
		return new SchoolOperations();
	}

	private class SchoolOperations implements SchoolDAO {

		@Override
		public void addStudent(Student student) {
			studentList.add(student);
		}

		@Override
		public void addEmployee(Employee employee) {
			employeeList.add(employee);
		}

	}

//ENCAPSULATION
	public static ArrayList<Student> getStudentList() {
		return studentList;
	}

	public static void setStudentList(ArrayList<Student> studentList) {
		SchoolDTO.studentList = studentList;
	}

	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		SchoolDTO.employeeList = employeeList;
	}

}

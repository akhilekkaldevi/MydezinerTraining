package School;

import java.util.ArrayList;

public class SchoolDTO {
//ENCAPSULATION encapsulating the list variables within the class with private access specifier.
	private static ArrayList<Student> studentList =new ArrayList<Student>();

	private static ArrayList<Employee> employeeList=new ArrayList<Employee>();

//ABSTRACTION created a private class(Scho0lOperations) and a helper method(getoblect) to access the class objects.

	public SchoolDAO getObject() {
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

        //POLYMORPHISM METHOD OVERLOADING	
		@Override
		public Student searchStudent(int id) {
			for(int i=0;i<studentList.size();i++) {
				if(studentList.get(i).getStudentId()==id)
					return studentList.get(i);
			}
			return null;
		}

		@Override
		public Student searchStudent(String name) {
			
			for(int i=0;i<studentList.size();i++) {
				if(studentList.get(i).getStudentName().equals(name))
					return studentList.get(i);
			}
			return null;
		}

	}

//getters and setters
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

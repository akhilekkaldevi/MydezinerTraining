package School;

public interface SchoolDAO {
	void addStudent(Student student);

	void addEmployee(Employee employee);

	Student searchStudent(int id);

	Student searchStudent(String name);
}

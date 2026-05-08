package employee.springBoot.details;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	private List<Employee> employeeList = new ArrayList<>(Arrays.asList(
			new Employee("101","Abhinay","01/09/1999", "Intern"),
			new Employee("102","Rajesh","16/12/1999", "Intern"),
			new Employee("103","SaiTeja","01/09/1999","Intern")
			));
	
	public List<Employee> getAllEmployees(){
		return employeeList;
	}
	
	public Employee getEmployee(String id){
		return employeeList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);		
	}

	public void updateEmployee(String id,Employee employee) {
		for(int i=0;i<employeeList.size();i++) {
			Employee l = employeeList.get(i);
			if(l.getId().equals(id)) {
				employeeList.set(i, employee);
				return;
			}
		}
		
	}

	public void deleteEmployee(String id) {
		employeeList.removeIf(t -> t.getId().equals(id));
	}
	
}

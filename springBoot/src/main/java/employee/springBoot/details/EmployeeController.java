package employee.springBoot.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService printService;
	
	@RequestMapping("/list")
	public List<Employee> list() {
		return printService.getAllEmployees();
	}
	
	@RequestMapping("/list/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return printService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/list")
	public void addEmployee(@RequestBody Employee employee) {
		printService.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/list/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		printService.updateEmployee(id, employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/list/{id}")
	public void deleteEmployee(@PathVariable String id) {
		printService.deleteEmployee(id);
	}
}

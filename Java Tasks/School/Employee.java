package School;

public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	private String empDesignation;
	private String domain;
	private int experience;
	private String branchType;

	@Override
	public String toString() {
		if (domain != null) {
			return "\nEmployee \n EmpId=" + empId + "\n empName=" + empName + "\n empSalary=" + empSalary
					+ "\n empDesignation=" + empDesignation + "\n domain=" + domain + "\n experience=" + experience
					+ "\n";
		}
		return "\nEmployee \n empId=" + empId + "\n empName=" + empName + "\n empSalary=" + empSalary
				+ "\n empDesignation=" + empDesignation + "\n branchType=" + branchType + "\n";
	}

	//Different Types of Constructors
	
	public Employee(int empId, String empName, int empSalary, String empDesignation, String domain, int experience) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.domain = domain;
		this.experience = experience;
	}

	public Employee(int empId, String empName, int empSalary, String empDesignation, String branchType) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.branchType = branchType;
	}
}

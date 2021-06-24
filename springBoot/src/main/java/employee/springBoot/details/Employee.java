package employee.springBoot.details;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
    @Column(name="id")
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="birthDate")
	private String birthDate;
	@Column(name="role")
	private String role;
	
	public Employee() {
	}
	
	public Employee(String id, String name, String birthDate, String role) {
		super();
		this.id = id;
		this.name = name;
		this.setBirthDate(birthDate);
		this.setRole(role);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

package BasicMavenProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "employeeone")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name ="eid")
	private int empId;
	@Column(name = "ename")
	private String name;
	private double salary;
	
	public EmployeeEntity() {
		super();
		
	}
	public EmployeeEntity(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

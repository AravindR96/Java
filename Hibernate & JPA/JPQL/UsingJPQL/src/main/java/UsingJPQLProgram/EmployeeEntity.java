package UsingJPQLProgram;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name="ename")
	private String Name;
	private Double Salary;
	@Override
    public String toString() {
		return "EmployeeEntity [empId=" + empId + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	public EmployeeEntity() {
		super();
		
	}
	public EmployeeEntity(int empId, String name, Double salary) {
		super();
		this.empId = empId;
		Name = name;
		Salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}

}

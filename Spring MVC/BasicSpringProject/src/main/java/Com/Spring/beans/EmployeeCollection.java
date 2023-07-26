package Com.Spring.beans;

import java.util.List;


public class EmployeeCollection {
	private int id;
	private String name;
	private double Salary;
	private List<String> languages;
	@Override
	public String toString() {
		return "EmployeeCollection [id=" + id + ", name=" + name + ", Salary=" + Salary + ", languages=" + languages
				+ "]";
	}
	public EmployeeCollection(int id, String name, double salary, List<String> languages) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.languages = languages;
	}
	public EmployeeCollection() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public List<String> ListLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

}

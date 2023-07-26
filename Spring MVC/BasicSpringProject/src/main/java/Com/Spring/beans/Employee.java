package Com.Spring.beans;

public class Employee {
	private int eId;
	private String name;
	private double salary;
	private Address address;
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	public void init() {
		System.out.println("In Init");
	}
	public void destroy() {
		System.out.println("In Destroy");
	}
	public Employee(int eId, String name, double salary, Address address) {
		super();
		System.out.println("In Parameterised Constructor All");
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		
		super();
		System.out.println("Non Parameterised Employee Constructor");
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
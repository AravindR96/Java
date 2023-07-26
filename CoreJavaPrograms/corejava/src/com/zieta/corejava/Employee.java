package com.zieta.corejava;

import java.lang.String;

public class Employee { 
	public String name;
	public int    id;
	public double salary;
	
//	public Employee(String name,int id, double salary) {
//		this.name=name;
//		this.id=id;
//		this.salary=salary;
//	}

	public Employee(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public double getSalary() {
		return salary;
	}

//	public void setSalary(Double salary) {
//		this.salary = salary;
//	}
	
	
//	public void Employee(String name,int id,Double salary) {
//		System.out.println(name+ " " + id+ " " +" " +salary);
//	}
}

package com.zieta.corejava;
import java.lang.String;
import java.util.*;
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee details");
		int n=sc.nextInt();
		Employee[] employees=new Employee[n];
		for(int i=0;i<n;i++) {
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		
		
		Employee emp=new Employee(name,id,salary);
//		emp.setName(name);
//		emp.setId(id);
//		emp.setSalary(salary);
		employees[i]=emp;
		}
//		emp.Employee(name, id, salary);		
		for(int i=0;i<n;i++) {
		System.out.println("Name"+employees[i].getName());
		System.out.println("id"+employees[i].getId());
		System.out.println("Salary"+employees[i].getSalary());
	}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				
				
				if(employees[i].getSalary()<employees[j].getSalary()) {
					
				Employee temp =employees[i];
				employees[i]=employees[j];
				employees[j]=temp;
			}
		}
			

}
		System.out.println(employees[0].getName()+""+employees[0].getSalary());
}}
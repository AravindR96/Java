package com.zieta.Assignments;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Employees");
	int n=sc.nextInt();
	Employee arr[]=new Employee[n];
	
	for(int i=0;i<n;i++) {

	
	
  System.out.println("Enter the  Employee Details");
	System.out.println("Enter the Id");
	int id =sc.nextInt();
	System.out.println("Enetr the Name ");
	String name =sc.next();
	System.out.println(" Enter the Salary");
	int salary =sc.nextInt();
	System.out.println("Enter the Company");
	String Company=sc.next();
	
	
	
	Employee emp=new Employee(id,name,salary,Company);
	arr[i]=emp;
	}
	for(int i=0;i<n;i++) {
		
	System.out.println(" Employee Details"+ i+1);
	System.out.println("Employee id"+" "+arr[i].getid());
	System.out.println("Employee name"+" "+arr[i].getname());
	System.out.println("Employee salary"+" "+arr[i].getsalary());
	System.out.println("Employee Company"+" "+arr[i].getCompany());
	}
	System.out.println("___________________________________________________________________");
	int count=0;
	for (int i = 0; i < n; i++)
	{
	if(arr[i].getsalary()>50000) {
		System.out.println("Employee id"+" "+arr[i].getid());
		System.out.println("Employee name"+" "+arr[i].getname());
		System.out.println("Employee salary"+" "+arr[i].getsalary());
		System.out.println("Employee Company"+" "+arr[i].getCompany());
       count++;
       
	}
	System.out.println("The total number of emplyees getting salary more than 50 k are "+count);
	}
	System.out.println(n);
	}
	
}

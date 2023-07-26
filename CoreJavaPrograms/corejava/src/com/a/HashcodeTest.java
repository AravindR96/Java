package com.a;

public class HashcodeTest {

	public static void main(String[] args) {
		Hashcode emp1 = new Hashcode(918, "Maria");  
		Hashcode emp2 = new Hashcode(918, "Maria");
		Hashcode emp3 = new Hashcode(918, "Maria");  
		//invoking hashCode() method  
		int a=emp1.hashCode();  
		int b=emp2.hashCode(); 
	    int c=emp1.hashCode();
		System.out.println("hashcode of emp1 = " + a);  
		System.out.println("hashcode of emp2 = " + b);  
		System.out.println("hashcode of emp1 = " + c);  
		System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  
		}  
	 
	}



package com.zieta.Assignments;

public class VariableDemo {

	    // static variable
	    static int count = 0;

	    // final variable
	    final String name = "John Doe";

	    // static final variable
	    static final double PI = 3.14159;

	    public static void main(String[] args) {
	        // accessing static variable
	        System.out.println("Count is: " + count);

	        // incrementing static variable
	        count++;

	        // accessing final variable
	        VariableDemo demo = new VariableDemo();
	        System.out.println("Name is: " + demo.name);

	        // accessing static final variable
	        System.out.println("PI is: " + PI);
	    }
	}


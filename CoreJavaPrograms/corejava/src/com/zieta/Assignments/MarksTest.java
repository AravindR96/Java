package com.zieta.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MarksTest {

	public static void main(String[] args) {
		
   /**  Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Marks 1st Subjects");
     int n=sc.nextInt();
     System.out.println("Enter the Marks 2nd Subjects");
     int n1=sc.nextInt();
     System.out.println("Enter the Marks 3rd Subjects");
     int n2=sc.nextInt();
     System.out.println("Enter the Marks 4th Subjects");
     int n3=sc.nextInt();
     System.out.println("Enter the Marks 5th Subjects");
     int n4=sc.nextInt();
     System.out.println("Enter the Marks 6th Subjects");
     int n5=sc.nextInt();
     Marks mr=new Marks();
     int marks=mr.display(n,n1,n2,n3,n4,n5);
   System.out.println(marks);**/
    Scanner sc=new Scanner(System.in);
    int total=0;
    System.out.println("Enter the number of marks");
     int n=sc.nextInt();
     Marks arr[]=new Marks[n];
 	
 	for(int i=0;i<n;i++) {
    System.out.println("Enter the  mark"+(i+1));
 	int a= sc.nextInt();
 	Marks mark=new Marks(a);
 	arr[i]=mark;
 	}
 	
 	for(int i=0;i<n;i++) {
 		
 		total=total+arr[i].getmarks();
 		
 		System.out.println("Marks"+(i+1)+" "+arr[i].getmarks());
 	}
 	System.out.println(total);  
 	double avg=total/n;
	if(avg<35) {
		System.out.println("Fail");
	}
	else if(avg<=45) {
		System.out.println("first class");
	}
	else if(avg<=55) {
		System.out.println("second class");
	}
	else if(avg<=75) {
		System.out.println("higher class");
	}
	else if(avg<=85) {
		System.out.println("distinction");
	}
	else if(avg>=90) {
		System.out.println("above distinction");
	}
	else {
		System.out.println("invalid marks");
	}
   }
}



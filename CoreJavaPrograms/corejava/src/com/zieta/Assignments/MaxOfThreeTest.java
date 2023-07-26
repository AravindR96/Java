package com.zieta.Assignments;

import java.util.Scanner;

public class MaxOfThreeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/**String arr[]=new String[3];
		arr[0]="a";
		arr[1]="b";
		arr[2]="c";
		for(int i=0;i<3;i++) {
			System.out.println("Enter the Number of"+arr[i]);
			int arr[i]= sc.nextInt();
			
		}**/
		
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		System.out.println("Enter the Number");
		int b=sc.nextInt();
		System.out.println("Enter the Number");
		int c=sc.nextInt();
		MaxofThee Max = new MaxofThee();
		Max. Display(a,b,c);
	}

}

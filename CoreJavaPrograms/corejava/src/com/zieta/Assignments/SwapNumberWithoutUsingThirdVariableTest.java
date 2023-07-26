package com.zieta.Assignments;

import java.util.Scanner;

public class SwapNumberWithoutUsingThirdVariableTest {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a= sc.nextInt();
		System.out.println("Enter the number");
		int b=sc.nextInt();
		SwapNumberWithoutUsingThirdVariable Swap = new SwapNumberWithoutUsingThirdVariable();
		Swap.Display(a,b);
		
	}

}

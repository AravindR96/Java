package com.zieta.Assignments;

import java.util.Scanner;

public class SwapNumberTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a= sc.nextInt();
		System.out.println("Enter the number");
		int b=sc.nextInt();
		SwapNumber Swap=new SwapNumber();
		Swap.Display(a,b);
		

	}

}

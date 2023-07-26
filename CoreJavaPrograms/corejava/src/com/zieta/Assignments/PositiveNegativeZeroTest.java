package com.zieta.Assignments;

import java.util.Scanner;

public class PositiveNegativeZeroTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		PositiveNegativeZero num= new PositiveNegativeZero();
		num.Display(n);

	}

}

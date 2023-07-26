package com.zieta.Assignments;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		int n=sc.nextInt();
		PrimeNumber num=new PrimeNumber();
		num.Display(n);

	}

}

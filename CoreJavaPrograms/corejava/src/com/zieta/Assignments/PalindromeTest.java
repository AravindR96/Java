package com.zieta.Assignments;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Number");
		 int n=sc.nextInt();
		Palindrome pal=new Palindrome();
		pal.Display(n);
		

	}

}

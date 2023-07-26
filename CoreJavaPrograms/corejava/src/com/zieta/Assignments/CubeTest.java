package com.zieta.Assignments;

import java.util.Scanner;

public class CubeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Cube c2=new Cube();
		double cube=c2.display(n);
		
		System.out.println(cube);
	}

}

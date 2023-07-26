package com.zieta.Assignments;

import java.util.Scanner;

public class ConstructorOverladingAreaCircleTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double r=sc.nextInt();
//		AreaCircle ac=new AreaCircle();
		
		AreaCircle ac1=new AreaCircle(r);
		AreaCircle ac2=new AreaCircle();
		System.out.println(ac1.Circle());
        System.out.println(ac2.Circle());
	}

}

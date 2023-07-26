package com.zieta.Assignments;

public class SwapNumberWithoutUsingThirdVariable {
	public void Display(int a, int b) {
		
		a=a+b;
	    b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
}

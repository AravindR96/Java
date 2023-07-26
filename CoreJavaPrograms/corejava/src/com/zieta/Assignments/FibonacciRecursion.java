package com.zieta.Assignments;

public class FibonacciRecursion {
	 static int f1=0,s2=1,t3;
	static void FibonacciRecursion(int count) {
	
	 if(count>0) {
		 t3=f1+s2;
		 f1=s2;
		 s2=t3;
		 System.out.println(t3);
		 FibonacciRecursion(count-1);
	 }
	}
	public static void main(String[] args) {
		int count=10;
	System.out.println(f1+" "+s2);
	FibonacciRecursion(count-2);

	}

}

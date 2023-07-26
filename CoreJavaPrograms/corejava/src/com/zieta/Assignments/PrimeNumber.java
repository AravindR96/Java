package com.zieta.Assignments;

public class PrimeNumber {
public void Display(int n) {
	if(n<=1) {
	  System.out.println(n +" Number is Not a PrimeNumber");
	}
	else if(n%2==0) {
		 System.out.println(n +" Number is Not a PrimeNumber");
	}
	else {
		int m=n/2;
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				 System.out.println(n +" Number is Not a PrimeNumber");
				return;
			}
		}
		System.out.println(n + " Number is a Prime");
	}
}
}

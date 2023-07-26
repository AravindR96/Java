package com.zieta.Assignments;

public class Palindrome {
	int sum=0,r;
	
public void Display(int n) {
	int temp=n;
	while(n>0) {
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	System.out.println(sum);
	if(temp==sum) {
		System.out.println("Palindrome number");
	}
	else
	{
		System.out.println("Not Palindrome number");
	}
}
}

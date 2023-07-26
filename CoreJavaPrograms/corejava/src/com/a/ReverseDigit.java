package com.a;

public class ReverseDigit {

	public static void main(String[] args) {
		int num=59862;
		int ans,rev=0;
		

		while(num!=0) {
			ans = num%10;
			rev=rev*10+ans;
			num = num/10;
			}
		System.out.print(rev);

	}

}

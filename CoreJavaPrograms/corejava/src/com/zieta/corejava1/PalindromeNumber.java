package com.zieta.corejava1;

public class PalindromeNumber {

	public static void main(String[] args) {
	int n=545;
	int sum=0,temp;
	int r;
	 temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		System.out.println(sum);
		
	}
	if(temp==sum) {

		System.out.println("palindrome number");
	}
		else {
			System.out.println("Not a palindrome number");
	}

}
}
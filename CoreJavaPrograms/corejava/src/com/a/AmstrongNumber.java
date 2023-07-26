package com.a;

public class AmstrongNumber {
public static void main(String args[]) {
	int number=371;
	int originalNumber,reminder;
	double result=0;
	originalNumber=number;
	while(originalNumber!=0) {
		reminder=originalNumber%10;
		result=result+Math.pow(reminder,3);
		originalNumber=originalNumber/10;
		
	}
	if(result==number)
		System.out.println(number+"is a Amstrong number");
	else
		System.out.println(number+"is not an Amstrong number");
}

}

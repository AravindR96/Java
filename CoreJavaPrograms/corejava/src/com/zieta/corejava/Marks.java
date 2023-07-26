package com.zieta.corejava;

public class Marks {

	public static void main(String[] args) {
		int Maths=55;
		int Science=56;
		int Socialscience=75;
		int English=85;
		int tamil=95;
		int csc=100;
		int sum=Maths+Science+Socialscience+English+tamil+csc;
		double avg=sum/6;
		if(avg<35) {
			System.out.println("Fail");
		}
		else if(avg<=45) {
			System.out.println("first class");
		}
		else if(avg<=55) {
			System.out.println("second class");
		}
		else if(avg<=75) {
			System.out.println("higher class");
		}
		else if(avg<=85) {
			System.out.println("distinction");
		}
		else if(avg<=90) {
			System.out.println("above distinction");
		}
		else {
			System.out.println("invalid marks");
		}
		
		
		

	}

}

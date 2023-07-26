package com.zieta.Assignments;

import com.zieta.corejava.String;

public class Marks {
	
	/**public int display(int Maths,int Science,int Socialscience,int English,int Tamil,int csc) {
		int sum=Maths+Science+Socialscience+English+Tamil+csc;
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
		else if(avg>=90) {
			System.out.println("above distinction");
		}
		else {
			System.out.println("invalid marks");
		}
		return sum;**/
		
		int marks;
		public Marks(int marks) {
			this.marks=marks;
		}
		public int getmarks() {
			return marks;
		

	}


}

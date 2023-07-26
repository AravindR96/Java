
package com.zieta.corejava1;

public class Febonacci {

	public static void main(String[] args) {
		int n=10;
		int f1=0;
		int s2=1;
		int t3 = 0;
		System.out.println(f1);
		System.out.println(s2);
		for(int i=1;i<=n;i++)
		{
			t3=f1+s2;
			System.out.println(t3);
			f1=s2;
			s2=t3;
			
			
		}
		
		
		
	}

}

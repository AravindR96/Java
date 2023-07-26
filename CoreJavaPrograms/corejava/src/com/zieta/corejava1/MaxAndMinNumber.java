package com.zieta.corejava1;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		int num[]= {15,2,8,4,50,20,7,5,10};
		int min=num[0],max=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
			if(num[i]>max) {
				max=num[i];
			}
			
				
			}
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);

	}

}

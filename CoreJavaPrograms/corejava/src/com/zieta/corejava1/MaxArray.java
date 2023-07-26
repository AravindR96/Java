package com.zieta.corejava1;

public class MaxArray {

	public static void main(String[] args) {
		int arr[]= {2,5,8,9,4,6,7,3};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				}
			if(min>arr[i]) {
				min=arr[i];
			}
		
		
	}
		System.out.println(max);
        System.out.println(min);
}
}
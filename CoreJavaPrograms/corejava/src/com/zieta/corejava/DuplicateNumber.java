package com.zieta.corejava;

public class DuplicateNumber {

	public static void main(String[] args) {
		int arr[]=new int[] {2,5,6,8,8,9,7,7,3,2,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);	
				
			}
			
		}

	}
		
}
	
}
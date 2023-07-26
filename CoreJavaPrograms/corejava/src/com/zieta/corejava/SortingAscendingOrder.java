package com.zieta.corejava;

public class SortingAscendingOrder {

	public static void main(String[] args) {
		int arr[]=new int[] {2,9,3,7,5,4,6,1,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(arr[i]);
		}
		
	}
	

}

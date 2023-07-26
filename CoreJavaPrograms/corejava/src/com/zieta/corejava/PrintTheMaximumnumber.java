package com.zieta.corejava;

public class PrintTheMaximumnumber {

	public static void main(String[] args) {
		int[] arr = {22,3,16,20,25,30,80,15};
		

for(int i=0;i<arr.length-1;i++) {
	
	for(int j=i+1;j<arr.length;j++) {

	
	if(arr[i]>arr[j]) {
		
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	
	
}

	   
	}
System.out.print(arr[0]+ " "+ arr[arr.length-1]);
	
	}}

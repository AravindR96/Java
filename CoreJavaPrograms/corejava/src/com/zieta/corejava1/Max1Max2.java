package com.zieta.corejava1;

public class Max1Max2 {

	public static void main(String[] args) {
		int arr[]= {2,6,7,5,9,8,3};
		int max1=0,max2=-1,max3=-2;
		for(int i=0;i<arr.length;i++) {
			if(max1<arr[i]&&max2<arr[i]&&max3<arr[i]) {
				max3=max2;
				max2=max1;
			 max1=arr[i];
			}
			else if(arr[i]>max2 && max3 <arr[i]) {
				max3=max2;
				max2=arr[i];
			}
			else if (arr[i]>max1) {
				max3=arr[i];
			}
		}
		System.out.println(max1+" "+max2+" ");

}
}

package com.zieta.corejava1;

public class PalindromeString {

	public static void main(String[] args) {
		String str="MADAM";
		String rev=" ";
		int len=str.length(); 
		  for ( int i = len - 1; i >= 0; i-- ) {
			rev=rev+str.charAt(i);
			
			
		}
		
		  System.out.println(rev);
	}

	

}

package com.zieta.corejava;

public class ReverseString {

	public static void main(String[] args) {

		java.lang.String str="Aravind";
		 java.lang.String rev = "";
		    for (int i = str.length() - 1; i >= 0; i--) {
		        rev =rev+ str.charAt(i);
		    }
		  System.out.println(rev);
	}

}

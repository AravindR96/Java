package com.zieta.Assignments;

public class TableTest {
	static int total=0;
	static void TableTest(int num) {
		 
		if (num>0) {
			total=total+5;
			System.out.println(total);
             TableTest(num-1);
		}
		}
	
	
	public static void main(String[] args) {
		int num=10;
		TableTest(num);
		}
	}


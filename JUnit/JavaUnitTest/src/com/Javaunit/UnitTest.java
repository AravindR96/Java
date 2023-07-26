package com.Javaunit;

import org.junit.gen5.api.AfterAll;
import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;

public class UnitTest {
	@Test
	public void testAddition() {
		Addition obj = new Addition();
		assertEquals(30,obj.addition(10,20));
		assertEquals(30,obj.addition(40,20));
	}

	private void assertEquals(int i, int addition) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testAssertion() {
		String str1 = new String ("abc");
		String str2= null;
		String str3= "abc";
		String str4= "abc";
		int val1 = 5;
		int val2= 6;
		
	}
	
	@AfterAll
	public static void afterall() {
		System.out.println("After All");
	}
	@AfterEach
	public  void aftereach() {
		System.out.println("After Each");
	}
	@BeforeEach
	public  void initEach() {
		System.out.println("Before Each");
		
		
	}

}

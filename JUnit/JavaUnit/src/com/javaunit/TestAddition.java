package com.javaunit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAddition {
	
	@Test

	public void testAssertion(){

	 String str1 = new String ("abc");

	String str3 = null;

	 String str4 = "abc";

	String str5 = "abc";

	int val1 = 5;

	int val2 = 6;

	assertTrue (val1 < val2);

	assertFalse(val1 > val2);

	assertNotNull(str1);

	assertNull(str3);

	assertSame(str4,str5);
}
	@Test
	public void testAssertion1(){

		 String str1 = new String ("abc");

		String str3 = null;

		 String str4 = "abc";

		String str5 = "abc";

		int val1 = 5;

		int val2 = 6;

		assertTrue (val1 < val2);

		assertFalse(val1 > val2);

		assertNotNull(str1);

		assertNull(str3);

		assertSame(str4,str5);
	}
@AfterAll
public static void afterall(){
System.out.println("After All");
 }
@AfterEach
 public void aftereach(){
System.out.println("After Each");

}
@BeforeEach
 public void initEach(){
System.out.println("Before Each");
}

	}

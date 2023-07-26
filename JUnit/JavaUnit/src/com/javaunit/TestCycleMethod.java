package com.javaunit;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestCycleMethod {
	public void TestCycleMethods() {
	 System.out.println("In Constructor");
	 }
		@BeforeEach
 void testBeforeEach() {
		System.out.println("In BeforeEach");
}
		@AfterEach
 void testAfterEach() {
		 System.out.println("In After Each");
		 }
		@BeforeAll
 static void testBeforeClass() {
		 System.out.println("In Before Class");
}
	@AfterAll
 static void testAfterClass() {
		System.out.println("In After Class");
}
		@Test
 void test1() {
		 System.out.println("In Test1");
		 }
		@Test
 void test2() {
		System.out.println("In Test2");
}
		}

		
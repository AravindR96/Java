package com.Javaunit;
import org.junit.gen5.api.AfterAll;
import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.Test;

public class TestCycleMethod {
	public  TestCycleMethod() {
		System.out.println("In Constructor");
	}
	@BeforeEach
	void testBeforeEach() {
		System.out.println(" In BeforeEach");
	}
	@AfterEach
	void testAfterEach() {
		System.out.println(" In After Each");
	}
	@BeforeAll
	static void testBeforeClass() {
		System.out.println("In Before Class");
	}
	@AfterAll
	static void testAfterClass() {
		System.out.println(" In After Class");
	}
	@Test
	void test1() {
		System.out.println(" In Test1");
	}
	@Test
	void test2() {
		System.out.println("In Test2");
		
	}

}

package Com.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Testing {
	@Test
	public void testDemo() {
		System.out.println("Hi, I am Test Case");
	}
@Test	
public void testAddition() {
	Addition obj=new Addition();
	assertEquals(30, obj.addition(10, 20));
}
}

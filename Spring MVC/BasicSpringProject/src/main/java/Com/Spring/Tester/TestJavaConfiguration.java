package Com.Spring.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Com.Spring.beans.Address;

import Com.Spring.resources.MyConfiguration;

public class TestJavaConfiguration {

	public static void main(String[] args) {
	
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Address address =(Address)ac.getBean("address");
		System.out.println(address);
		
	}

}

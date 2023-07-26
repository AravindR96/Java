package Com.Spring.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Spring.beans.Employee;
import Com.Spring.beans.EmployeeCollection;

public class TestCollection {
	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Com/Spring/resources/my_bean_configuration1.xml");
		EmployeeCollection employee =(EmployeeCollection) ac.getBean("employee2");
		System.out.println(employee);
		
}
}
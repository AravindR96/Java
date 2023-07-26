package Com.Spring.Tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Spring.beans.Address;
import Com.Spring.beans.Employee;

public class TestEmployee {
	public static void main(String args[]) {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("Com/Spring/resources/my_bean_configuration.xml");
		ApplicationContext ac = new ClassPathXmlApplicationContext("Com/Spring/resources/Autowiring.xml");
		Employee employee =(Employee)ac.getBean("employee");
		//Employee employee =(Employee)ac.getBean("empObject");
		Address address = employee.getAddress();
		System.out.println(employee);
		System.out.println(address);
	}

}

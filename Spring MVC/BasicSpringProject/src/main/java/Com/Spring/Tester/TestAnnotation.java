package Com.Spring.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Spring.beans.Annotations;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Com/Spring/resources/Annotation_my_bean_configuration.xml");
           Annotations obj =(Annotations)ac.getBean("annotation");
           obj.display();
	}

}

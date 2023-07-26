package BasicMavenProject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Test {
	public static void main(String args[]) {
		  // displayById();
		 // displayAllName();
		  // displayNameAndSalary();
		 // displayBySalaryPositional();
		 //  displayBySalaryNamed();
		     addEmployee();
	   }

	static public void displayById() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = factory.createEntityManager();
		EmployeeEntity emp =em.find(EmployeeEntity.class,1);
	    System.out.println(emp);
	}
	static public void displayAllName() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = factory.createEntityManager();
	    Query query = em.createQuery("Select e.name FROM EmployeeEntity e");
	    List<String> listOfNames = query.getResultList();
	    for(String name: listOfNames) {
	    	System.out.println(name);
	    }
	}

	static public void displayNameAndSalary() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = factory.createEntityManager();
		 Query query = em.createQuery("Select e.name FROM EmployeeEntity e");
		 List<Object> nameAndSalary = query.getResultList();
		 for(Object  nameAndSalaryList : nameAndSalary ) {
			 Object obj[]=(Object[])nameAndSalaryList;
			 String name = (String) obj[0];
			 double salary = (Double)obj[1];
			 System.out.println(name + " "+ salary );
			 
		 }
	}
	static public void displayBySalaryPositional() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = factory.createEntityManager();
		 Query query = em.createQuery("Select e.name FROM EmployeeEntity e");
		 double value1 = 50;
		 double value2 = 60;
		 query. setParameter (1, value1);
		 query. setParameter (2, value2);
		 
		 List<Object> nameAndSalaryList = query.getResultList();
		 for(Object nameAndSalary: nameAndSalaryList) {
			 Object obj[] =(Object[])nameAndSalary;
			 String name = (String)obj[0];
			 double salary = (Double)obj[1];
			 System.out.println(name + " "+ salary );
			 }
			 
		 }
	static public void displayBySalaryNamed() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = factory.createEntityManager();
		 Query query = em.createQuery("Select e.name FROM EmployeeEntity e");
		 double value1 = 50;
		 double value2 = 60;
		 query. setParameter ("lb", value1);
		 query. setParameter ("ub", value2);
		 
		 List<Object> nameAndSalaryList = query.getResultList();
		 for(Object nameAndSalary: nameAndSalaryList) {
			 Object obj[] =(Object[])nameAndSalary;
			 String name = (String)obj[0];
			 double salary = (Double)obj[1];
			 System.out.println(name + " "+ salary );
			 } 
		 }
	static public void addEmployee() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = factory.createEntityManager();
		EmployeeEntity emp1 = new EmployeeEntity(5,"AravindRavi",95);
		em.getTransaction().begin();
		em.persist(emp1);
		em.getTransaction().commit();
	}
	
}



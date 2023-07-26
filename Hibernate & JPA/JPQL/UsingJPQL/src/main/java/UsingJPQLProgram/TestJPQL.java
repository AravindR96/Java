
package UsingJPQLProgram;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestJPQL {
 public static void main(String args[]) {
	displayAll(); 
	//displayOneColumnAll();
	//displayOneSalaryAll();
//	displayNameAndSalaryAll();
	//displayBySalaryAll();
	//demo();
 }
 public static void demo(){




	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee_details");

	 EntityManager em = factory.createEntityManager();

	  Query query = em.createQuery("SELECT e.Name,e.Salary FROM EmployeeEntity e");

	 List<Object> nameSalaryList = query.getResultList() ;

	 for(Object obj:nameSalaryList) {

	  Object e[] =(Object[]) obj;
 System.out.println((String)e[0] + " " + (Double)e[1]);

 }

 }
 public static void displayAll() {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");  
     EntityManager em=emf.createEntityManager();  
       Query query = em.createQuery("Select e FROM EmployeeEntity e");
       List<EmployeeEntity> employeeList = query.getResultList();
       for(EmployeeEntity emp:employeeList) {
    	   System.out.println(emp);
       }
 }
 public static void displayOneColumnAll() {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");  
     EntityManager em=emf.createEntityManager();  
       Query query = em.createQuery("Select e.Name FROM EmployeeEntity e");
       List<String> nameList = query.getResultList();
       for(String name:nameList) {
    	   System.out.println(name);
       }
 }
 public static void displayOneSalaryAll() {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");  
     EntityManager em=emf.createEntityManager();  
       Query query = em.createQuery("Select e.Salary FROM EmployeeEntity e");
       List<Double> salaryList = query.getResultList();
       for(Double salary:salaryList) {
    	   System.out.println(salary);
       }
 }
 public static void displayNameAndSalaryAll() {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");  
     EntityManager em=emf.createEntityManager();  
       Query query = em.createQuery("Select e.Name,e.Salary FROM EmployeeEntity e ");
       List<Object> nameSalaryList = query.getResultList();
       System.out.println("Name And Salary");
       for(Object obj: nameSalaryList) {
    	   System.out.println("display");
    	   Object e[] = (Object[]) obj;
    	   System.out.println((String)e[0] + " " + (Double)e[1]);
       }
 }
 public static void displayBySalaryAll() {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");  
     EntityManager em=emf.createEntityManager();  
       Query query = em.createQuery("Select e FROM EmployeeEntity e where Salary >=?1");
       query.setParameter(1, 6000.0);
       List<EmployeeEntity> employeeList = query.getResultList();
       for(EmployeeEntity emp:employeeList) {
    	   System.out.println(emp);
       }
 }
}

package Com.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestManyToOne {

	public static void main(String[] args) {
	 addEmployeeDepartment();
		//deleteEmployeeDepartment();
	}
	public static void deleteEmployeeDepartment() {
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("ManyToOne_Type");  
        EntityManager em=Factory.createEntityManager();  
      EmployeeEntity emp1 = em.find(EmployeeEntity.class,1001);
      if(emp1 !=null) {
    	  em.getTransaction().begin();
    	  em.remove(emp1);
    	  em.getTransaction().commit();
    	  System.out.println("Its done");
    	  
      }else {
    	  System.out.println("No Record Found");
      }
         
	}
	
	public static void addEmployeeDepartment() {
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("ManyToOne_Type");  
        EntityManager em=Factory.createEntityManager();  
        DepartmentEntity department = new DepartmentEntity(101,"Development");
        EmployeeEntity emp1 = new EmployeeEntity(1001,"Ram",department);
        EmployeeEntity emp2 = new EmployeeEntity(1002,"Sham",department);
        
         
          em.getTransaction().begin();
          em.persist(emp1);
          em.persist(emp2);
          em.getTransaction().commit();
          System.out.println("It done");
	}
}

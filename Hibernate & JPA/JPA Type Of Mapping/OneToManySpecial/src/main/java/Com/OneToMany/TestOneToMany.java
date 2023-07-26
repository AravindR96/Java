package Com.OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;


public class TestOneToMany {

	public static void main(String[] args) {
	
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("OneToMany_Type");  
        EntityManager em=Factory.createEntityManager();  
        CompanyEntity company = new CompanyEntity();
        EmployeeEntity emp1 = new EmployeeEntity(1001,"Ram");
        EmployeeEntity emp2 = new EmployeeEntity(1002,"Sham");
        List<EmployeeEntity> employees = new ArrayList <EmployeeEntity>();
        employees.add(emp1);
        employees.add(emp2);
        company.setCompanyId(1001);
        company.setCompanyName("ICons");
        company.setEmployees(employees);
         
          em.getTransaction().begin();
          em.persist(company);
         
          em.getTransaction().commit();
          System.out.println("It done");
	}
	}


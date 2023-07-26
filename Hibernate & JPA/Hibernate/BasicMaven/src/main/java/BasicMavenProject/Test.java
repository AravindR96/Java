package BasicMavenProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Test {
	public static void main(String args[]) {
		displayById();
	}
	static public void displayById() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = factory.createEntityManager();

		EmployeeEntity e = new EmployeeEntity();
		
		e.setName("aravind");
		e.setSalary(1000);
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println(e);
		em.close();
		factory.close();
	}
}


package OneToOnePrograms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {
		
		
		//deleteEmployeeAsset();
		addEmployeeAsset();
	}
		public static void deleteEmployeeAsset() {
			EntityManagerFactory Factory=Persistence.createEntityManagerFactory("OneToOne_Type");  
	        EntityManager em=Factory.createEntityManager();  
	        EmployeeEntity emp = em.find(EmployeeEntity.class,111);
	        if(emp !=null) {
	        	em.getTransaction().begin();
	        	em.remove(emp);
	        	em.getTransaction().commit();
	        	System.out.println("Its removed from both");
	        }else {
	        	System.out.println("No record found");
	        }
		}
		
	
	 public static void addEmployeeAsset() {
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("OneToOne_Type");  
        EntityManager em=Factory.createEntityManager();  
        AssetEntity asset = new AssetEntity();
        asset.setAid(101);
        asset.setAname("Acer laptop");
        EmployeeEntity emp1 = new EmployeeEntity();
          emp1.setEid(111);
          emp1.setEname("Ram");
          emp1.setAsset(asset);
          em.getTransaction().begin();
          em.persist(emp1);
          em.getTransaction().commit();
          System.out.println("It done");
	}

}

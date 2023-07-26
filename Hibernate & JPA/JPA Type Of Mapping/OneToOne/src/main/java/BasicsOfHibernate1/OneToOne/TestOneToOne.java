package BasicsOfHibernate1.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class TestOneToOne 
{
    public static void main( String[] args )
    
    {
    	
    	BusRouteDetails brd = new BusRouteDetails();
    	brd.setBusRoute("Medavakkam To Tambaram");
    	
    	StudentRegisteration ru=new  StudentRegisteration();
    	 ru.setRegisterNo(105);
    	 ru.setName("Ram");
    	 ru.setDept("MECH");
    	 ru.setBusroute(brd);
    	 
    	 Configuration c=new Configuration().configure().addAnnotatedClass(StudentRegisteration.class).addAnnotatedClass(BusRouteDetails.class);
    	 ServiceRegistry s=new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
    	 SessionFactory sf=c.buildSessionFactory(s);
    	 Session ss=sf.openSession();
    	 Transaction trans=ss.beginTransaction();
    	 ss.save(brd);
    	 ss.save(ru);
    	 trans.commit();

    }
}

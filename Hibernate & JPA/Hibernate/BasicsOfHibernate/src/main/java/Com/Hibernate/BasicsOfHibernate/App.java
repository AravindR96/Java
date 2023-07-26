package Com.Hibernate.BasicsOfHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App
{
    public static void main( String[] args )
    {
    	 RegisterationUser ru=new  RegisterationUser();
    	 ru.setRegisterNo(105);
    	 ru.setName("Ram");
    	 ru.setDept("MECH");
    	 Configuration c=new Configuration().configure().addAnnotatedClass(RegisterationUser.class);
    	 ServiceRegistry s=new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
    	 SessionFactory sf=c.buildSessionFactory(s);
    	 Session ss=sf.openSession();
    	 Transaction trans=ss.beginTransaction();
    	 ss.save(ru);
    	 trans.commit();

    }
}

package in.praneeth.LLMS.HibernateOneShot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.praneeth.Entity.Employee;


/**
 * Hello world!
 *
 */
public class Insertion 
{
    
	@SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
     Configuration configure = new Configuration().configure().addAnnotatedClass(Employee.class);
     SessionFactory sessionfac=configure.buildSessionFactory();
    Session session= sessionfac.openSession();
    Transaction tx= session.beginTransaction();
    
    
    Employee employee=new Employee();
    employee.setName("PHANI");
    employee.setAge(22);
    employee.setCompany("BLACKROCK");
    employee.setCity("VIKARABAD");
      
     session.save(employee);
    
    tx.commit();
    session.close();
     
    }
}

package in.praneeth.LLMS.HibernateOneShot;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.praneeth.Entity.Employee;


public class DATETIMEInsertion {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Configuration config=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Employee employee=new Employee();
		employee.setName("PRANEETH");
		employee.setAge(23);
		employee.setCompany("FACEBOOK");
		employee.setCity("HYDERABAD");
	   employee.setDate(new Date());
	   employee.setTime(new Date());
	   employee.setTimeStamps(new Date());
	   
	   Transaction tx=session.beginTransaction();
	   session.save(employee);
	   tx.commit();
	   System.out.println("INSERTION SUCCESFUL");
	   session.close();
	   
		
	}

}

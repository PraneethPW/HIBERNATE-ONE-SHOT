package in.praneeth.LLMS.HibernateOneShot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.praneeth.Entity.Employee;

public class Updation {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Configuration configure = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory=configure.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee employee=new Employee();
	employee=session.get(Employee.class, "PRANAY");
	if(employee!=null) {
		employee.setCompany("META");
		session.update(employee);
		tx.commit();
		System.out.println("UPDATION SUCCESFUL");
		
	
	}
	
		
	
	
	}

}

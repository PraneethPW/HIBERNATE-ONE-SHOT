package in.praneeth.LLMS.HibernateOneShot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.praneeth.Entity.Employee;



public class Delete {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Employee employee=new Employee();
		org.hibernate.cfg.Configuration configure = new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=configure.buildSessionFactory();
	
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		employee=session.get(Employee.class, "PRANEETH");
		if(employee!=null) {
			session.delete(employee);
			tx.commit();
			System.out.println("DELETION SUCCESFUL");
		}else {
			System.out.println("NO RECORD FOUND");
		}
		
	}

}

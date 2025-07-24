package in.praneeth.LLMS.HibernateOneShot;



import org.hibernate.Session;
import org.hibernate.SessionFactory;


import in.praneeth.Entity.Employee;


public class Selection {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Employee employee=new Employee();
		org.hibernate.cfg.Configuration configure=new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=configure.buildSessionFactory();
		Session session=sf.openSession();
		String Name="PRANEETH";
		       employee=session.get(Employee.class, Name);
		session.save(employee);
		System.out.println(employee);	
		
	}

}

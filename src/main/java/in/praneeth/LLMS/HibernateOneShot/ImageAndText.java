package in.praneeth.LLMS.HibernateOneShot;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import in.praneeth.Entity.Employee;

public class ImageAndText {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws IOException {
		Configuration config=new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sessiofac=config.buildSessionFactory();
		Session session = sessiofac.openSession();
		Transaction tx=session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("DRAKE");
		employee.setAge(32);
		employee.setCompany("BLACK ROCK SSD");
		employee.setCity("UNITED KINGDOM");
		employee.setDate(new Date());
		employee.setTime(new Date());
		employee.setTimeStamps(new Date());
		
		FileInputStream io=new FileInputStream("C:\\Users\\prane\\Downloads\\Black Rock.avif");
		byte[] input =new byte[io.available()];
		io.read(input);
		employee.setCompanyImage(input);
		String note= "WELCOME TO THE COMPANY";
		char[] info= note.toCharArray();
		employee.setCompanyText(info);
		
		session.save(employee);
		tx.commit();
		System.out.println("INSERTION SUCCESFUL");
		io.close();
		
		
	
		
		
	}

}

package Hibernate_Projects_2.Hibernate_web_1;

import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dao_logics {
	
	public static Session getConnection()
	{
		Session ses=null;
		try {
			Configuration cfg=new Configuration();
			cfg.configure("Hibernate_Projects_2\\Hibernate_web_1\\config.xml");
			
			SessionFactory sf=cfg.buildSessionFactory();
			
			ses=sf.openSession();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ses;
	}

	public Vector Register_logics(Data d)
	{
		Vector v=new Vector();
		try
		{
		d.getId();
		d.getFirstname();
		d.getLastname();
		d.getEmail();
		d.getPassword();
		d.getStdcode();
		d.getPhoneno();
		d.getGender();
		
		// connection
		
		Session ses=Dao_logics.getConnection();
	
		ses.save(d);
		
			
		System.out.println("Record Updated sucessfully");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Hibernate_Projects_2\\Hibernate_web_1\\spring.xml");
		Data d1=(Data) ctxt.getBean("data");
		
		v.add(d1);		
		return v;
	}
	/*
	public Vector Appobj()
	{
		Vector v=new Vector();
		
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Hibernate_Projects_2\\Hibernate_web_1\\spring.xml");
		
		Data d=(Data) ctxt.getBean("data");
		
		v.add(d);
		
		return v;
	}
	
	*/
}

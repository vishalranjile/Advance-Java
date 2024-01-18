package com.demo.test;



import com.demo.model.Studentss;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestStudent {

	public static void main(String[] args) {
		Studentss s=new Studentss(5,"vishal");
		Studentss s1=new Studentss(6,"vishnu");
		Studentss s2=new Studentss(7,"visha");
		Studentss s3=new Studentss(8,"vishu");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		tr.commit();
		session.close();
		
	}

}

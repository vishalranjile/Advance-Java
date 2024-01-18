package com.demo.test;

import org.hibernate.cfg.Configuration;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.demo.model.Games;


public class TestGame {

	public static void main(String[] args) {
		Games g1=new Games("A");
		Games g2=new Games("B");
		Games g3=new Games("C");
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
//		Session session=sf.openSession();
//		org.hibernate.Transaction tr=session.beginTransaction();
//		session.save(g1);
//		session.save(g2);
//		session.save(g3);
//		tr.commit();
//		session.close();
		
		Session sess1=sf.openSession();
		org.hibernate.Transaction tr1= sess1.beginTransaction();
		Games emp1=sess1.load(Games.class, 5);
		System.out.println("before");
		System.out.println(emp1.getName());
		System.out.println("after");
		
	}

}

package com.Project_with_Maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;

public class Hibernate_Object_State {

	public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		//practicle of hibernate object status
		//transient
		//persistant state
		//detached state 
		//removed state
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
		//creating student object
		Student student=new Student();
		student.setId(1414);
		student.setName("peter");
		student.setCity("abc");
		student.setCerti(new Certificate("java hibernate course","2 month"));
		//student transient state
		Session s=f.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		s.save(student);
		//persistant state: object associated with session and database
		student.setName("John");
		tx.commit();
		
		
		s.close();//detached state
		//after closing session this is not updated in database because it will bein detached state
		student.setName("sachin");
		
		
		///remove state means data associated with state but remove from database.
		
		
		System.out.println(student);

		
		
		f.close();
		
	}

}

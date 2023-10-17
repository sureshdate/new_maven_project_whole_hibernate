package com.Project_with_Maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch_Demo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// get-student:101
		// Student student=(Student)session.get(Student.class, 101);
	
        //get method  
	/*	Address ad = (Address) session.get(Address.class, 1);
		System.out.println(ad);
		System.out.println(ad.getStreet());
		
		Address ad1 = (Address) session.get(Address.class, 1);
		System.out.println(ad1);
		System.out.println(ad1.getStreet());*/
		//only one time hibernate will fire this query because already prsent in catche memory
		
		//load method
		/*Student student=(Student)session.load(Student.class, 10123);
		System.out.println(student);//object not found exception throw because not found this object in database*/
		
		
		Student student=(Student)session.load(Student.class, 101);//no heat to database only load 
		//but when u use sysout then it will fire query
		System.out.println(student.getCity());
		

		/*Student student = (Student) session.load(Student.class, 101);
		System.out.println(student);*/

	}

}

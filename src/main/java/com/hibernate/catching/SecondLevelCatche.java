package com.hibernate.catching;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Project_with_Maven.Student;



public class SecondLevelCatche {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session1=factory.openSession();
		//first
		Student student1=session1.get(Student.class,1415);
		System.out.println(student1);
		session1.close();
		
		Session session2=factory.openSession();
		//second
		Student student2=session1.get(Student.class,1415);
		System.out.println(student2);
		session2.close();

	}

}

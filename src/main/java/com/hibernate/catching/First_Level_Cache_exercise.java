package com.hibernate.catching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Project_with_Maven.Student;

public class First_Level_Cache_exercise {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
		//by default method enabled
		Student student=session.get(Student.class, 1415);
		System.out.println(student);
		
		System.out.println("working something.....");
		
		Student student1=session.get(Student.class, 1415);
		System.out.println(student1);
		
		session.close();
		factory.close();
	}

}

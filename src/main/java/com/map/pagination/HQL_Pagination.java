package com.map.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Project_with_Maven.Student;

public class HQL_Pagination {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s=factory.openSession();
		 Query query =s.createQuery("from Student");
		 //this is pagination method
		 query.setFirstResult(0);
		 query.setMaxResults(5);
		 List<Student> list=query.list();
		 for(Student student:list) { 
			 //from 0indexto 4index data will be retun
			 System.out.println(student.getName()+ " "+student.getCerti().getCourse());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 s.close();
		factory.close();
		
	}

}

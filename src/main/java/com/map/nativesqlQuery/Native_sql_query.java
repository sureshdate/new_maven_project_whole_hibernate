package com.map.nativesqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.Project_with_Maven.Student;

public class Native_sql_query {
   public static void main(String[] args) {
	    Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s=factory.openSession();
		String q="select * from student";
		NativeQuery nq=s.createNativeQuery(q);
		/*List<Student> list = nq.list();
		for(Student student:list) {
			System.out.println(student.getName()+ " " +student.getCity());
		}*/
		
		/*List<Object[]> list = nq.list();
		for(Object[] student:list) {
			System.out.println(Arrays.toString(student));
		}*/
		
		List<Object[]> list = nq.list();
		for(Object[] student:list) {
			System.out.println(student[4]+" "+student[3]);
		}
		s.close();
		factory.close();
}
}

package com.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Project_with_Maven.Student;

import jakarta.transaction.Transaction;

public class Hql_Example {
  public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session s=factory.openSession();
	
	
	
	//Hql syntax
	//String query="from Student where city='mumbai'";
	//String query="from Student where city=:x";
	String query="from Student as s where s.city=:x and s.name=:n";
	Query q=s.createQuery(query);
	//
	
	q.setParameter("x", "mumbai");//you can create from ouside also.
	q.setParameter("n", "peter");
	//single-unique
	//multiple-list
	List<Student> list=q.list();
	
	for(Student student:list) {
		System.out.println(student.getName()+ " "+student.getCerti().getCourse());
	}
	System.out.println("--------------------------------------------------------------------");
	
	org.hibernate.Transaction tx=s.beginTransaction();//because transaction required. for update and deletes operation
	//for delete operation
	/*Query q2=s.createQuery("delete from Student s where s.city=:c");
	q2.setParameter("c", "Abc");
	int r=q2.executeUpdate();
	System.out.println("deleted");
	System.out.println(r);*/
	
	
	//update operation
	/*Query q3=s.createQuery("update Student set city=:c where name=:n");
	q3.setParameter("c","delhi");
	q3.setParameter("n","peter");
	int r=q3.executeUpdate();
	System.out.println(r);*/
	
	
	//How to execute join query
	Query q4=s.createQuery("select q.question,q.questionId,a.answer from Question as q inner join q.answers as a");
	List<Object[]> list4=q4.getResultList();
	for (Object[]arr:list4)
	{
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	tx.commit();
	s.close();
    factory.close();
}
}

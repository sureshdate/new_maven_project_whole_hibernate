package com.Project_with_Maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class embed_demo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory=cfg.buildSessionFactory();
	    
	    //create Student object
	    Student student1=new Student();
	    student1.setId(14134);
	    student1.setName("Aniket_Tiwari");
	    student1.setCity("Mumbai");
	    
	    //create Certificate1 object
	    Certificate certificate1=new Certificate();
	    certificate1.setCourse("Java");
	    certificate1.setDuration("2 months");
        student1.setCerti(certificate1);	    
        
        
        //create Student2 object
	    Student student2=new Student();
	    student2.setId(14135);
	    student2.setName("vishal singh");
	    student2.setCity("Delhi");
	    
	    //create Certificate2 object
	    Certificate certificate2=new Certificate();
	    certificate2.setCourse("dotnet");
	    certificate2.setDuration("1.5 months");
        student2.setCerti(certificate2);	   
        
        
        Session s=factory.openSession();       
        Transaction tx=s.beginTransaction();
        s.save(student1);
        s.save(student2);
        tx.commit();
	    factory.close();
		
	}

}

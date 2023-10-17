package com.Project_with_Maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Programme statrted");

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// System.out.println(factory);
		// System.out.println(factory.isClosed());

		// creatin student object
		Student st = new Student();
		st.setId(101);
		st.setName("Suresh");
		st.setCity("Mumbai");
		System.out.println(st);

		// creating address object
		Address ad = new Address();
		ad.setStreet("street1");
		ad.setCity("Delhi");
		ad.setAddedDate(new Date());
		ad.setOpen(true);
		ad.setX(134.567);
		
		// reading image
		/*FileInputStream fis = new FileInputStream("src/main/java/box5_image.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);*/

		// for adding Student data in database
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("done");

  
	}
}

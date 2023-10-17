package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CascadeExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s=factory.openSession();
		Question q1=new Question();
		q1.setQuestionId(567);
		q1.setQuestion("what is cascading");
		
		
		//if u dont write cascade as type then it wil not save in database wothought s.save(a1) method
		//cascading means id u declare in a question class before answer column as cascade type then answer will automatically save in database withought calling  s.save(a1)......... ");
		Answer a1=new Answer();
		a1.setAnswer_id(23423);
		a1.setAnswer("if u dont write cascade as type then it wil not save in database wothought s.save(a1) method");
		
		Answer a2=new Answer();
		a2.setAnswer_id(23424);
		a2.setAnswer("cascading means id u declare in a question class before answer column as cascade type then answer will automatically save in database withought calling  s.save(a1)......... ");
		
		List<Answer> list=new ArrayList<>();
		list.add(a1);
		list.add(a2);
		
		q1.setAnswers(list);
		Transaction tx=s.beginTransaction();
		
		s.save(q1);
		
		tx.commit();
		s.close();
		
		

	}

}

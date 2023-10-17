package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		/*/ creating question object
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java?");

		// creating answer object
		Answer answer1 = new Answer();
		answer1.setAnswer_id(343);
		answer1.setAnswer("Java is a programming language");
		answer1.setQuestion(q1);
		q1.setAnswer(answer1);

		// creating question2 object
		Question q2 = new Question();
		q2.setQuestionId(1213);
		q2.setQuestion("What is dotnet?");

		// creating answer2 object
		Answer answer2 = new Answer();
		answer2.setAnswer_id(344);
		answer2.setAnswer("dotnet is a programming language");
		answer2.setQuestion(q2);
		q2.setAnswer(answer2);
		// session ke pass save method rehta he
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q1);
		s.save(q2);
		s.save(answer1);
        s.save(answer2);
        //fetching
        Question newQ=(Question)s.get(Question.class, 1212);
        System.out.println(newQ.getQuestion());
        System.out.println(newQ.getAnswer().getAnswer());//here is one dout
        
		tx.commit();

		factory.close();*/ //this is for one to one mapping
		
		/*//this is for ONE TO MANY MAPPING
		
		// creating question3 object
				Question q3 = new Question();
				q3.setQuestionId(1314);
				q3.setQuestion("What is Java?");

				// creating answer1 object
				Answer answer1 = new Answer();
				answer1.setAnswer_id(364);
				answer1.setAnswer("Java is a programming language");
				answer1.setQuestion(q3);
				
				// creating answer2 object
				Answer answer2 = new Answer();
				answer2.setAnswer_id(365);
				answer2.setAnswer("With the help of java we can create software");
				answer2.setQuestion(q3);
				
				// creating answer3 object
				Answer answer3 = new Answer();
				answer3.setAnswer_id(366);
				answer3.setAnswer("Java has a different type of framwroks");
				answer3.setQuestion(q3);
				
				List<Answer> list=new ArrayList<Answer>();
				list.add(answer1);
				list.add(answer2);
				list.add(answer3);
				q3.setAnswers(list);
			   
				// session ke pass save method rehta he
				
				Session s = factory.openSession();
				Transaction tx = s.beginTransaction();
				s.save(q3);
				s.save(answer1);
				s.save(answer2);
				s.save(answer3);
				tx.commit();
				factory.close();*/
		
		  //for fetching 
		  /* Session s = factory.openSession();
		   Transaction tx = s.beginTransaction();
		   Question q=(Question) s.get(Question.class,1314);
		   System.out.println(q.getQuestion());
	   
		   for (Answer a : q.getAnswers()) {
		     System.out.println(a.getAnswer());
	       }
				tx.commit();
				s.close();*/
		
		  //fetching Eager and Lazy
		  /* Session s = factory.openSession();
		   Transaction tx = s.beginTransaction();
		   Question q=(Question)s.get(Question.class,1314);
		  /* System.out.println(q.getQuestionId());//by default lazy operation
		   System.out.println(q.getQuestion());
		   //Lazy
		   System.out.println(q.getAnswers().size());
		   
          // tx.commit();
		   //s.close();
		   */
		   
		   
	}

}

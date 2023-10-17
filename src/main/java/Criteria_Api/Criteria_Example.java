package Criteria_Api;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Restriction;
import com.Project_with_Maven.Student;


public class Criteria_Example {

	public static void main(String[] args) {
		/*Session s=new Configuration().configure().buildSessionFactory().openSession();
		Criteria criteria=s.createCriteria(Student.class); 
		List<Student> Students=criteria.list();
		//criteria.add(Restriction.eq("certi.course","dot_net"));
		//criteria.add(Restriction.gt("id","1415"));//isnull,between we can use
		//criteria.add(Restriction.like("certi.course","dot_net"));//dotnet se start sabhi project tayar kar sakte he.
		for(Student st:Students) {
			System.out.println(st);
		}
		*/

	}

}

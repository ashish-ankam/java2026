package co.upskill.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.upskill.model.Student;

public class LaunchStandardApp {

	public static void main(String[] args) {
		Configuration config = null;
		SessionFactory sf = null;
		Session s = null;
		Transaction transac = null;
		boolean flag = false;

		config = new Configuration();
		config.configure();

		sf = config.buildSessionFactory();

		s= sf.openSession();


		Student student = new Student();

		student.setId(2);
		student.setsAge(23);
		student.setsCity("hyderabad");
		student.setsName("Goutham");


		try {
			transac = s.beginTransaction();
			s.persist(student);
			flag=true;


		}catch(HibernateException e) {

			e.printStackTrace();
		}
		catch(Exception e) {

			e.printStackTrace();
		}
		finally{
			if(flag)
			{

				transac.commit();

			}
			else {
				transac.rollback();

			}
			sf.close();
			s.close();


		}


	}
}

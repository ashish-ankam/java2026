package com.upskill.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.upskill.model.Student;

public class LaunchUpdate {

	public static void main(String[] args) {
		
		
	  SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
      Session session = null;
      Transaction transaction=null;
      boolean flag=false;
      
      try {
    	  session = sessionFactory.openSession();
    	  transaction = session.beginTransaction();
    	  Student student = new Student();
    	  student.setId(4);
  		student.setsAge(25);
  		student.setsCity("Telangana");
  		student.setsName("Dhoni");
  		
  		//session.update(student);
  	//session.saveOrUpdate(student);
  		session.merge(student);
  		
  		flag=true;
      }
      catch(HibernateException e) {
    	  e.printStackTrace();
      }
      catch(Exception e) {
    	  e.printStackTrace();
      }
      finally {
    	  if(flag)
    	  {
    		  transaction.commit();
    	  }
    	  else {
    		  transaction.rollback();
    	  }
    	  session.close();
    	  sessionFactory.close();
      }
      
	  
	}

}

package com.upskill.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.upskill.model.Student;

public class LaunchUpdate {

	public static void main(String[] args) {
		
		
	  SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
      Session session = null;
      
      
	  
	}

}

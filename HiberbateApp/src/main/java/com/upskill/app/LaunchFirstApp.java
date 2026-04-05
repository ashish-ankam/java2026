package com.upskill.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.upskill.model.Student;


public class LaunchFirstApp {

	public static void main(String[] args) {
	
		
		//Step 01 Configuration Object
		Configuration config = new Configuration();
		
		//Step 02 Configure hibernate.cfg.xml file to Configuration Object
		config.configure();
		
		//Step 03 Create SessionFactory Object
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		//Step04 Get the Session Object from Session Factory
		Session openSession = sessionFactory.openSession();
		
		//Step 05 Begin the Transaction within Session
		Transaction beginTransaction = openSession.beginTransaction();
		
		Student student = new Student();
		
		student.setId(1);
		student.setsAge(22);
		student.setsCity("hyderabad");
		student.setsName("Buddha");
		
		//Stp06 Perform operation
		openSession.save(student);
		
		//Step 07 performing transaction operation
		beginTransaction.commit();
		
		
		//Step08 close the session
		openSession.close();
		

	}

}

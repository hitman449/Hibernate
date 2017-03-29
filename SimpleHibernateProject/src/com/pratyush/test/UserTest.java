package com.pratyush.test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pratyush.entity.UserDetails;

public class UserTest {
	public static void main(String[] args){
		
		UserDetails userDetails =new UserDetails();
		userDetails.setPassword("Prat@5148");
		userDetails.setAddress("Electronics City");
		userDetails.setDesciption("this is test");
		userDetails.setJoinedDate(new Date(0));
		
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();
		
		userDetails=null;
		
		Session session2= sessionFactory.openSession();
		session2.beginTransaction();
		UserDetails uDetails=session2.get(UserDetails.class, 6);
		System.out.println(uDetails.getDesciption());
		session2.close();
		
	}

}

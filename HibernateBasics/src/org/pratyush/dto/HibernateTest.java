package org.pratyush.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
 public static void main(String[] args) {
	UserDetails userDetails = new UserDetails();
	Address address = new Address();
	address.setCity("Bangalore");
	address.setPincode("460100");
	address.setState("KA");
	address.setStreet("1A");
	userDetails.setUserName("Pratyush");
	
	Address address1 = new Address();
	address1.setCity("Bangalore1");
	address1.setPincode("4601001");
	address1.setState("KA1");
	address1.setStreet("1A1");
	
	
	Address address2 = new Address();
	address2.setCity("Bangalore2");
	address2.setPincode("4601002");
	address2.setState("KA2");
	address2.setStreet("1A2");
	
	userDetails.getListOfAddress().add(address);
	userDetails.getListOfAddress().add(address1);
	userDetails.getListOfAddress().add(address2);
	
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session =sessionFactory.openSession();
	
	session.beginTransaction();
	session.save(userDetails);
	session.getTransaction().commit();
	session.close();
	
	

	session= sessionFactory.openSession();
	session.beginTransaction();
	userDetails=session.get(UserDetails.class,1);
	session.close();
	System.out.println(userDetails.getListOfAddress());
	System.out.println("Id "+userDetails.getUserId()+ " User Name " +userDetails.getUserName());
	session.getTransaction().commit();
	
	
	
	
	
}
}

package org.pratyush.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
 public static void main(String[] args) {
	UserDetails userDetails = new UserDetails();
	userDetails.setUserName("Pratyush");
	
	Vehicle vehicle = new Vehicle();
	vehicle.setVehicleName("Gixxer");
	
	userDetails.setVehicle(vehicle);
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session =sessionFactory.openSession();
	
	session.beginTransaction();
	session.save(userDetails);
	session.getTransaction().commit();
	//session.close();
	
	

	
	
	
	
	
	
}
}

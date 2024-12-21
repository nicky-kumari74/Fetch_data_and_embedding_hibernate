package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fetch data from student table
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	student st=(student)session.get(student.class, 111);
    	
    	System.out.println(st.getId()+" "+st.getName()+" "+st.getCity());
    	session.close();
    	sf.close();
	}

}

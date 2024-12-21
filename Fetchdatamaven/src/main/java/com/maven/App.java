package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Fetch data from student table------
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	student st=new student();
    	st.setId(111);
    	st.setName("vicky");
    	st.setCity("patna");
    	Session session=sf.openSession();
    	Transaction tc=session.beginTransaction();
    	session.save(st);
    	tc.commit();
    	session.clear();
    	
    }
}

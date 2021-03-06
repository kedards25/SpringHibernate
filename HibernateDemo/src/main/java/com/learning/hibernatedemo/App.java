package com.learning.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learning.hibernatedemo.models.SampleModel;
import com.learning.hibernatedemo.service.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SampleModel model=new SampleModel(101, "Kedar", "kedar@gmail.com", "Vileparle");
       
    	   Session session=HibernateUtil.getSessionFactory().getCurrentSession();
       
    	   Transaction trans=session.beginTransaction();
    	   		//session.save(model);
    	  
    	   
    	   SampleModel sample=
    			   (SampleModel)session.createQuery("from com.learning.hibernatedemo.models.SampleModel")
    			   .list()
    			   .get(0);
    	   
    	   System.out.println(sample);
    	   trans.commit();

    }
}

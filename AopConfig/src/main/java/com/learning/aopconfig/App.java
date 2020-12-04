package com.learning.aopconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=
    		   new ClassPathXmlApplicationContext("beans.xml");
       PrimaryClass primClass=(PrimaryClass)context.getBean("primLogicBean");
       primClass.show();
       
    }
}

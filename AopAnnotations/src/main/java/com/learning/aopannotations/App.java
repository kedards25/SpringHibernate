package com.learning.aopannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=
        		new AnnotationConfigApplicationContext(AopConfig.class);
        PrimaryClass primClass=(PrimaryClass)context.getBean(PrimaryClass.class);
        primClass.show();
    }
}

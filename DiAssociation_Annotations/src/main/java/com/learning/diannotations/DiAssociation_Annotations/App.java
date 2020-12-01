package com.learning.diannotations.DiAssociation_Annotations;

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
        		new AnnotationConfigApplicationContext(DiConfig.class);
        
        Demo1 d1=context.getBean(Demo1.class);
        d1.showColor();
    }
}

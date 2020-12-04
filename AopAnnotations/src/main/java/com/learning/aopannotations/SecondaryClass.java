package com.learning.aopannotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecondaryClass {

	@Before("execution (* com.learning.aopannotations.PrimaryClass.*(..))")
	public void execBefore(JoinPoint joinPoint)
	{
		System.out.println("Invoked before");
	}
	
	@After("execution (* com.learning.aopannotations.PrimaryClass.*(..))")
	public void execAfter(JoinPoint joinPoint)
	{
		System.out.println("Invoked after");
	}
	
}

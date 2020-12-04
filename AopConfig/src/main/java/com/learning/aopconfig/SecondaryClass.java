package com.learning.aopconfig;

import org.aspectj.lang.JoinPoint;

public class SecondaryClass {

	public void execBefore(JoinPoint joinPoint)
	{
		System.out.println("method invoked before");
	}
	
	public void execAfter(JoinPoint joinPoint)
	{
		System.out.println("method invoked after");
	}
}

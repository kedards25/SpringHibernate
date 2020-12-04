package com.learning.aopannotations;

import org.springframework.stereotype.Component;

@Component
public class PrimaryClass {

	public void show()
	{
		System.out.println("From show method in primary class");
	}
}

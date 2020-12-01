package com.learning.diannotations.DiAssociation_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//this states that object of the mentioned class 
		  //will be injected somewhere
public class Demo1 {

	@Autowired	//stating that we need to inject 
	Demo2 demo2;//an object of Demo2 class at runtime
	
	
	public void showColor()
	{
		System.out.println("Color from Demo2 "+demo2.getColor());
	}
	
}

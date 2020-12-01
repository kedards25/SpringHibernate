package com.learning.diannotations.DiAssociation_Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component	//this states that object of the mentioned class 
			//will be injected somewhere
public class Demo2 {

	@Value(value = "Red")	//setting the value using annotation
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}

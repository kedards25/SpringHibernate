package com.learning.propertyinjectionconfig;

public class DemoClass {
	
	String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void show()
	{
		System.out.println(getColor());
	}
}

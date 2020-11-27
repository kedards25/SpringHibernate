package com.learning.inheritancediconfig;

public class DemoC {

	//Creating an uninitialised object of DemoP
	//which we are going to inject at runtime
	//with the help of getter setters
	DemoP demoP;
	
	public DemoP getDemoP() {
		return demoP;
	}

	public void setDemoP(DemoP demoP) {
		this.demoP = demoP;
	}

	//accessing method from DemoP
	//using an injected object
	public void showColor()
	{
		System.out.println("Color from parent class: "+demoP.getColor());
	}
	
}

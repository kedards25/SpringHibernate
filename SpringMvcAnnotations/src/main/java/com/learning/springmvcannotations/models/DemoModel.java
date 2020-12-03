package com.learning.springmvcannotations.models;

import org.springframework.stereotype.Component;

//states that instance of this class
//will be created,maintained and injected 
//by spring container
@Component
public class DemoModel {

	private int demoId;
	private String demoName;
	private String demoAddr;
	private String demoMail;
	
	public DemoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoModel(int demoId, String demoName, String demoAddr, String demoMail) {
		super();
		this.demoId = demoId;
		this.demoName = demoName;
		this.demoAddr = demoAddr;
		this.demoMail = demoMail;
	}

	public int getDemoId() {
		return demoId;
	}

	public void setDemoId(int demoId) {
		this.demoId = demoId;
	}

	public String getDemoName() {
		return demoName;
	}

	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}

	public String getDemoAddr() {
		return demoAddr;
	}

	public void setDemoAddr(String demoAddr) {
		this.demoAddr = demoAddr;
	}

	public String getDemoMail() {
		return demoMail;
	}

	public void setDemoMail(String demoMail) {
		this.demoMail = demoMail;
	}

	@Override
	public String toString() {
		return "DemoModel [demoId=" + demoId + ", demoName=" + demoName + ", demoAddr=" + demoAddr + ", demoMail="
				+ demoMail + "]";
	}
	
	
	
}

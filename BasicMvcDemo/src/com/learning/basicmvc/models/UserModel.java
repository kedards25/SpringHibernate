package com.learning.basicmvc.models;

public class UserModel {

	private String userName;
	private String userPass;
	private String userMail;
	private String userAddr;
	private String userContact;
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String userName, String userPass, String userMail, String userAddr, String userContact) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.userMail = userMail;
		this.userAddr = userAddr;
		this.userContact = userContact;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	@Override
	public String toString() {
		return "UserModel [userName=" + userName + ", userPass=" + userPass + ", userMail=" + userMail + ", userAddr="
				+ userAddr + ", userContact=" + userContact + "]";
	}
	
	
	
}

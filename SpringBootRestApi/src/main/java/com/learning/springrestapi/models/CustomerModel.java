package com.learning.springrestapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class CustomerModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custId;
	
	@Column(name="name")
	private String custName;
	
	@Column(name="addr")
	private String custAddr;
	
	@Column(name="contact",unique=true)
	private long custContact;

	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerModel(int custId, String custName, String custAddr, long custContact) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddr = custAddr;
		this.custContact = custContact;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	public long getCustContact() {
		return custContact;
	}

	public void setCustContact(long custContact) {
		this.custContact = custContact;
	}

	@Override
	public String toString() {
		return "CustomerModel [custId=" + custId + ", custName=" + custName + ", custAddr=" + custAddr
				+ ", custContact=" + custContact + "]";
	}
	
	
}

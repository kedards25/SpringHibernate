package com.learning.hibernatedemo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sample")
public class SampleModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sampleId;
	
	@Column(name="smpl_name")
	private String sampleName;
	
	@Column(unique = true)
	private String sampleMail;
	
	private String sampleAddr;
	
	public SampleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SampleModel(int sampleId, String sampleName, String sampleMail, String sampleAddr) {
		super();
		this.sampleId = sampleId;
		this.sampleName = sampleName;
		this.sampleMail = sampleMail;
		this.sampleAddr = sampleAddr;
	}

	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getSampleMail() {
		return sampleMail;
	}

	public void setSampleMail(String sampleMail) {
		this.sampleMail = sampleMail;
	}

	public String getSampleAddr() {
		return sampleAddr;
	}

	public void setSampleAddr(String sampleAddr) {
		this.sampleAddr = sampleAddr;
	}

	@Override
	public String toString() {
		return "SampleModel [sampleId=" + sampleId + ", sampleName=" + sampleName + ", sampleMail=" + sampleMail
				+ ", sampleAddr=" + sampleAddr + "]";
	}
	
	
	
	
}

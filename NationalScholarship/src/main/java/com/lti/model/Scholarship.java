package com.lti.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Scholarship {

	@Id
	@SequenceGenerator(name = "seq_scholarship", initialValue = 4000,allocationSize=1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_scholarship")
	@Column(name="SCHOLARSHIP_ID")
	private int scholarshipId;
	
	@Column(name="SCHOLARSHIP_NAME")
	private String scholarshipName;
	
	@Column(name="SCHOLARSHIP_DESCRIPTION")
	private String scholarshipDescription;
	
	@Column(name="SCHOLARSHIP_AMOUNT")
	private int scholarshipAmount;
	
	@Column(name="SCHOLARSHIP_STATUS")
	private String scholarshipStatus;
	
	@Column(name="SCHOLARSHIP_LEVEL")
	private String scholarshipLevel;

	public int getScholarshipId() {
		return scholarshipId;
	}

	public void setScholarshipId(int scholarshipId) {
		this.scholarshipId = scholarshipId;
	}

	public String getScholarshipName() {
		return scholarshipName;
	}

	public void setScholarshipName(String scholarshipName) {
		this.scholarshipName = scholarshipName;
	}

	public String getScholarshipDescription() {
		return scholarshipDescription;
	}

	public void setScholarshipDescription(String scholarshipDescription) {
		this.scholarshipDescription = scholarshipDescription;
	}

	public int getScholarshipAmount() {
		return scholarshipAmount;
	}

	public void setScholarshipAmount(int scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}

	public String getScholarshipStatus() {
		return scholarshipStatus;
	}

	public void setScholarshipStatus(String scholarshipStatus) {
		this.scholarshipStatus = scholarshipStatus;
	}

	public String getScholarshipLevel() {
		return scholarshipLevel;
	}

	public void setScholarshipLevel(String scholarshipLevel) {
		this.scholarshipLevel = scholarshipLevel;
	}
		
}
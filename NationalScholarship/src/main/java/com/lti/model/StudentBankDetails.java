package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_BANK_DETAILS")
public class StudentBankDetails {
	@Id
	@SequenceGenerator(name = "seq_bank", initialValue = 2000,allocationSize=1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_bank")
	@Column(name="ID")
	private int bankDetailId;
	
	@Column(name="BANK_ACCOUNT_NO")
	private double accountNo;
	
	@Column(name="BANK_NAME")
	private String bankName;
	
	@Column(name="BANK_IFSC")
	private String ifscCode;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentRegistration studentRegistration;
	

	public int getBankDetailId() {
		return bankDetailId;
	}

	public void setBankDetailId(int bankDetailId) {
		this.bankDetailId = bankDetailId;
	}

	public double getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "StudentBankDetails [bankDetailId=" + bankDetailId + ", accountNo=" + accountNo + ", bankName="
				+ bankName + ", ifscCode=" + ifscCode + "]";
	}
	
	
	
}
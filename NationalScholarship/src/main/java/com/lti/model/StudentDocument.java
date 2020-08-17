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
@Table(name ="STUDENT_DOCUMENT")
public class StudentDocument {
	
	@Id
	@SequenceGenerator(name = "seq_doc", initialValue = 10,allocationSize = 1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_doc")
	@Column(name="ID")
	private int docId;

	@Column(name="DOMICILE_CERTIFICATE")
	private String domicileCertificate;
	
	@Column(name="STUDENT_PHOTOGRAPH")
	private String studentPhotograph;
	
	@Column(name="INSTITUTE_ID_CARD")
	private String instituteIdCard;
	
	@Column(name="CASTE_CERTIFICATE")
	private String casteCertificate;
	
	@Column(name="PREVIOUS_YEAR_MARKSHEET")
	private String previousYearMarksheet;
	
	@Column(name="FEE_RECEIPT")
	private String feeReceipt;
	
	@Column(name="BANK_PASSBOOK")
	private String bankPassbook;
	
	@Column(name="AADHAR_CARD")
	private String aadharCard;
	
	@Column(name="CLASS_10_MARKSHEET")
	private String classTenthMarksheet;
	
	@Column(name="CLASS_12_MARKSHEET")
	private String classTwelthMarksheet;
	
	@Column(name="BONAFIDE_CERTIFICATE")  
    private String bonafideCertificate;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentRegistration studentRegistration;

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDomicileCertificate() {
		return domicileCertificate;
	}

	public void setDomicileCertificate(String domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}

	public String getStudentPhotograph() {
		return studentPhotograph;
	}

	public void setStudentPhotograph(String studentPhotograph) {
		this.studentPhotograph = studentPhotograph;
	}

	public String getInstituteIdCard() {
		return instituteIdCard;
	}

	public void setInstituteIdCard(String instituteIdCard) {
		this.instituteIdCard = instituteIdCard;
	}

	public String getCasteCertificate() {
		return casteCertificate;
	}

	public void setCasteCertificate(String casteCertificate) {
		this.casteCertificate = casteCertificate;
	}

	public String getPreviousYearMarksheet() {
		return previousYearMarksheet;
	}

	public void setPreviousYearMarksheet(String previousYearMarksheet) {
		this.previousYearMarksheet = previousYearMarksheet;
	}

	public String getFeeReceipt() {
		return feeReceipt;
	}

	public void setFeeReceipt(String feeReceipt) {
		this.feeReceipt = feeReceipt;
	}

	public String getBankPassbook() {
		return bankPassbook;
	}

	public void setBankPassbook(String bankPassbook) {
		this.bankPassbook = bankPassbook;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getClassTenthMarksheet() {
		return classTenthMarksheet;
	}

	public void setClassTenthMarksheet(String classTenthMarksheet) {
		this.classTenthMarksheet = classTenthMarksheet;
	}

	public String getClassTwelthMarksheet() {
		return classTwelthMarksheet;
	}

	public void setClassTwelthMarksheet(String classTwelthMarksheet) {
		this.classTwelthMarksheet = classTwelthMarksheet;
	}

	public String getBonafideCertificate() {
		return bonafideCertificate;
	}

	public void setBonafideCertificate(String bonafideCertificate) {
		this.bonafideCertificate = bonafideCertificate;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	@Override
	public String toString() {
		return "StudentDocument [docId=" + docId + ", domicileCertificate=" + domicileCertificate
				+ ", studentPhotograph=" + studentPhotograph + ", instituteIdCard=" + instituteIdCard
				+ ", casteCertificate=" + casteCertificate + ", previousYearMarksheet=" + previousYearMarksheet
				+ ", feeReceipt=" + feeReceipt + ", bankPassbook=" + bankPassbook + ", aadharCard=" + aadharCard
				+ ", classTenthMarksheet=" + classTenthMarksheet + ", classTwelthMarksheet=" + classTwelthMarksheet
				+ ", bonafideCertificate=" + bonafideCertificate + "]";
	}

	
	
	
}
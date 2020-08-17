package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_REGISTRATION")
public class StudentRegistration {

	@Id
	@SequenceGenerator(name = "seq_reg", initialValue = 50501,allocationSize=1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_reg")
	@Column(name="STUDENT_ID")
	private int studentId;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	@Column(name="STUDENT_DOB")
	private LocalDate studentDOB;
	
	@Column(name="STUDENT_GENDER")
	private String studentGender;
	
	@Column(name="STUDENT_MOBILE_NO")
	private int studentMobileNo;
	
	@Column(name="STUDENT_EMAIL")
	private String studentEmail;
	
	@Column(name="STUDENT_AADHAR_NO")
	private int studentaadhar;
	
	@Column(name="STUDENT_STATE")
	private String studentState;
	
	@Column(name="STUDENT_DISTRICT")
	private String studentDistrict;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private Users users;

	@ManyToOne
	@JoinColumn(name="INSTITUTE_CODE")
	private InstituteRegistration instituteRegistration;
	
	@OneToOne(mappedBy="studentRegistration")
	private StudentAcademicDetails studentAcademicDetails;
	
	@OneToOne(mappedBy="studentRegistration")
	private StudentBankDetails studentBankDetails;
	
	@OneToOne(mappedBy="studentRegistration")
	private StudentBasicDetails studentBasicDetails;
	
	@OneToOne(mappedBy="studentRegistration")
	private StudentDocument studentDocumentDetails;
	
	@OneToOne(mappedBy="studentRegistration")
	private Status status;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(LocalDate studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public int getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(int studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public int getStudentaadhar() {
		return studentaadhar;
	}

	public void setStudentaadhar(int studentaadhar) {
		this.studentaadhar = studentaadhar;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getStudentDistrict() {
		return studentDistrict;
	}

	public void setStudentDistrict(String studentDistrict) {
		this.studentDistrict = studentDistrict;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public InstituteRegistration getInstituteRegistration() {
		return instituteRegistration;
	}

	public void setInstituteRegistration(InstituteRegistration instituteRegistration) {
		this.instituteRegistration = instituteRegistration;
	}

	public StudentAcademicDetails getStudentAcademicDetails() {
		return studentAcademicDetails;
	}

	public void setStudentAcademicDetails(StudentAcademicDetails studentAcademicDetails) {
		this.studentAcademicDetails = studentAcademicDetails;
	}

	public StudentBankDetails getStudentBankDetails() {
		return studentBankDetails;
	}

	public void setStudentBankDetails(StudentBankDetails studentBankDetails) {
		this.studentBankDetails = studentBankDetails;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentDocument getStudentDocumentDetails() {
		return studentDocumentDetails;
	}

	public void setStudentDocumentDetails(StudentDocument studentDocumentDetails) {
		this.studentDocumentDetails = studentDocumentDetails;
	}
	

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StudentRegistration [studentId=" + studentId + ", studentName=" + studentName + ", studentDOB="
				+ studentDOB + ", studentGender=" + studentGender + ", studentMobileNo=" + studentMobileNo
				+ ", studentEmail=" + studentEmail + ", studentaadhar=" + studentaadhar + ", studentState="
				+ studentState + ", studentDistrict=" + studentDistrict + "]";
	}
	
	
}

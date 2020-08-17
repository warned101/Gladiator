package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="INSTITUTE")
public class InstituteRegistration {

	@Id
	@SequenceGenerator(name = "seq_inst", initialValue = 10101,allocationSize=1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_inst")
	@Column(name="INSTITUTE_CODE")
	private int instituteCode;
	
	@Column(name="INSTITUTE_CATEGORY")
	private String instituteCategory;
	
	@Column(name="INSTITUTE_NAME")
	private String instituteName;
	
	@Column(name="INSTITUTE_DISE_CODE")
	private String instituteDISECode;
	
	@Column(name="INSTITUTE_TYPE")
	private String instituteType;
	
	@Column(name="AFFILIATED_UNIVERSITY_NAME")
	private String affiliatedUniversityName;
	
	@Column(name="AFFILIATED_UNIVERSITY_STATE")
	private String affiliatedUniversityState;
	
	@Column(name="YEAR_STARTED")
	private int yearStarted;
	
	@Column(name="INSTITUTE_ESTB_CERT")
	private String instituteEstbCert;
	
	@Column(name="INSTITUTE_AFF_CERT")
	private String instituteAffCert;
	
	@Column(name="INSTITUTE_LOCATION")
	private String instituteLoc;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="INSTITUTE_CITY")
	private String instituteCity;
	
	@Column(name="INSTITUTE_STATE")
	private String instituteState;
	
	@Column(name="INSTITUTE_PINCODE")
	private int institutePincode;
	
	@Column(name="DISTRICT")
	private String district;
	
	@Column(name="PRINCIPAL_NAME")
	private String principalName;
	
	@Column(name="MOBILE_NUMBER")
	private int mobileNumber;
	
	@Column(name="INSTITUTE_EMAIL")
	private String instituteEmail;

	@OneToOne
	@JoinColumn(name="USER_ID")
	private Users users;
	

	@OneToMany(mappedBy="instituteRegistration", cascade=CascadeType.ALL)
	private List <StudentRegistration> studentRegistrations;

	
	@OneToOne(mappedBy="instituteRegistration", cascade=CascadeType.ALL)
	private InstituteStatus instituteStatus;
	

	public String getInstituteEmail() {
		return instituteEmail;
	}


	public void setInstituteEmail(String instituteEmail) {
		this.instituteEmail = instituteEmail;
	}


	public int getInstituteCode() {
		return instituteCode;
	}


	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}


	public String getInstituteCategory() {
		return instituteCategory;
	}


	public void setInstituteCategory(String instituteCategory) {
		this.instituteCategory = instituteCategory;
	}


	public String getInstituteName() {
		return instituteName;
	}


	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}


	public String getInstituteDISECode() {
		return instituteDISECode;
	}


	public void setInstituteDISECode(String instituteDISECode) {
		this.instituteDISECode = instituteDISECode;
	}


	public String getInstituteType() {
		return instituteType;
	}


	public void setInstituteType(String instituteType) {
		this.instituteType = instituteType;
	}


	public String getAffiliatedUniversityName() {
		return affiliatedUniversityName;
	}


	public void setAffiliatedUniversityName(String affiliatedUniversityName) {
		this.affiliatedUniversityName = affiliatedUniversityName;
	}


	public String getAffiliatedUniversityState() {
		return affiliatedUniversityState;
	}


	public void setAffiliatedUniversityState(String affiliatedUniversityState) {
		this.affiliatedUniversityState = affiliatedUniversityState;
	}


	public int getYearStarted() {
		return yearStarted;
	}


	public void setYearStarted(int yearStarted) {
		this.yearStarted = yearStarted;
	}


	public String getInstituteEstbCert() {
		return instituteEstbCert;
	}


	public void setInstituteEstbCert(String instituteEstbCert) {
		this.instituteEstbCert = instituteEstbCert;
	}


	public String getInstituteAffCert() {
		return instituteAffCert;
	}


	public void setInstituteAffCert(String instituteAffCert) {
		this.instituteAffCert = instituteAffCert;
	}


	public String getInstituteLoc() {
		return instituteLoc;
	}


	public void setInstituteLoc(String instituteLoc) {
		this.instituteLoc = instituteLoc;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getInstituteCity() {
		return instituteCity;
	}


	public void setInstituteCity(String instituteCity) {
		this.instituteCity = instituteCity;
	}


	public String getInstituteState() {
		return instituteState;
	}


	public void setInstituteState(String instituteState) {
		this.instituteState = instituteState;
	}


	public int getInstitutePincode() {
		return institutePincode;
	}


	public void setInstitutePincode(int institutePincode) {
		this.institutePincode = institutePincode;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getPrincipalName() {
		return principalName;
	}


	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}


	public int getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	public List<StudentRegistration> getStudentRegistrations() {
		return studentRegistrations;
	}


	public void setStudentRegistrations(List<StudentRegistration> studentRegistrations) {
		this.studentRegistrations = studentRegistrations;
	}
	
	


	public InstituteStatus getInstituteStatus() {
		return instituteStatus;
	}


	public void setInstituteStatus(InstituteStatus instituteStatus) {
		this.instituteStatus = instituteStatus;
	}


	@Override
	public String toString() {
		return "InstituteRegistration [instituteCode=" + instituteCode + ", instituteCategory=" + instituteCategory
				+ ", instituteName=" + instituteName + ", instituteDISECode=" + instituteDISECode + ", instituteType="
				+ instituteType + ", affiliatedUniversityName=" + affiliatedUniversityName
				+ ", affiliatedUniversityState=" + affiliatedUniversityState + ", yearStarted=" + yearStarted
				+ ", instituteEstbCert=" + instituteEstbCert + ", instituteAffCert=" + instituteAffCert
				+ ", instituteLoc=" + instituteLoc + ", address=" + address + ", instituteCity=" + instituteCity
				+ ", instituteState=" + instituteState + ", institutePincode=" + institutePincode + ", district="
				+ district + ", principalName=" + principalName + ", mobileNumber=" + mobileNumber + ", instituteEmail="
				+ instituteEmail + "]";
	}
	
	
}
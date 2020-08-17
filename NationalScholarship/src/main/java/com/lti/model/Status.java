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
@Table(name="STATUS")
public class Status {

	@Id
	@SequenceGenerator(name = "seq_status", initialValue = 6000,allocationSize=1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_status")
	@Column(name="STATUS_ID")
	private int statusId;
	
	@Column(name="STATUS_DESCRIPTION")
	private String statusDescription;
	
	@Column(name="INSTITUE_APPROVAL_STATUS")
	private boolean instituteApprovalStatus;
	
	@Column(name="NADAL_APPROVAL_STATUS")
	private boolean nadalApprovalStatus;
	
	@Column(name="MINISTRY_APPROVAL_STATUS")
	private boolean ministryApprovalStatus;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentRegistration studentRegistration;

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public boolean isInstituteApprovalStatus() {
		return instituteApprovalStatus;
	}

	public void setInstituteApprovalStatus(boolean instituteApprovalStatus) {
		this.instituteApprovalStatus = instituteApprovalStatus;
	}

	public boolean isNadalApprovalStatus() {
		return nadalApprovalStatus;
	}

	public void setNadalApprovalStatus(boolean nadalApprovalStatus) {
		this.nadalApprovalStatus = nadalApprovalStatus;
	}

	public boolean isMinistryApprovalStatus() {
		return ministryApprovalStatus;
	}

	public void setMinistryApprovalStatus(boolean ministryApprovalStatus) {
		this.ministryApprovalStatus = ministryApprovalStatus;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusDescription=" + statusDescription
				+ ", instituteApprovalStatus=" + instituteApprovalStatus + ", nadalApprovalStatus="
				+ nadalApprovalStatus + ", ministryApprovalStatus=" + ministryApprovalStatus + "]";
	}
	

}

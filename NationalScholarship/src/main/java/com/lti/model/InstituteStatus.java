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
@Table(name="INSTITUE_STATUS")
public class InstituteStatus {
	
	@Id
	@SequenceGenerator(name = "seq_Inststatus", initialValue = 7000,allocationSize=1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_Inststatus")
	@Column(name="STATUS_ID")
	private int statusId;
	
	@Column(name="STATUS_DESCRIPTION")
	private String statusDescription;
	
	@Column(name="NADAL_APPROVAL_STATUS")
	private boolean nadalApprovalStatus;
	
	@Column(name="MINISTRY_APPROVAL_STATUS")
	private boolean ministryApprovalStatus;
	
	@OneToOne
	@JoinColumn(name="INSTITUTE_ID")
	private InstituteRegistration instituteRegistration;

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

	public InstituteRegistration getInstituteRegistration() {
		return instituteRegistration;
	}

	public void setInstituteRegistration(InstituteRegistration instituteRegistration) {
		this.instituteRegistration = instituteRegistration;
	}

	@Override
	public String toString() {
		return "InstituteStatus [statusId=" + statusId + ", statusDescription=" + statusDescription
				+ ", nadalApprovalStatus=" + nadalApprovalStatus + ", ministryApprovalStatus=" + ministryApprovalStatus
				+ "]";
	}
	
	
	

}

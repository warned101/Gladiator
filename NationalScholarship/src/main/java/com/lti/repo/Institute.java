package com.lti.repo;

import java.util.List;

import com.lti.model.InstituteRegistration;
import com.lti.model.InstituteStatus;
import com.lti.model.Scholarship;
import com.lti.model.Status;
import com.lti.model.StudentRegistration;

public interface Institute {
	public boolean readLogin(int userid, String password);
	public List<StudentRegistration> readApplications();
	public void readStudentByStudentId();
	public void readScholarshipDetails();
	public Status approveStudentStatus();
	public void readOwnApproveStatus();
	public void applyForRegistration();
}

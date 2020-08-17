package com.lti.repo;

import java.util.List;

import com.lti.model.InstituteRegistration;
import com.lti.model.Status;
import com.lti.model.StudentRegistration;

public interface Nodal {
	public void readLogin(String username, String password);
	public List<StudentRegistration> fetchStudentByStudentCode();
	public List<StudentRegistration> readStudentApplications();
	public Status approveStudentStatus();
	public List<InstituteRegistration> fetchInstituteByInstituteCode();
	public List<InstituteRegistration> readInstituteApplications();
	public Status approveInstituteStatus();
//	public Scholarship addScholarshipDetails();
	public void readScholarshipDetails();
	public void nodalRegistration();
}

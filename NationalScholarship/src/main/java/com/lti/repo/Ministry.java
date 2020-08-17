package com.lti.repo;

import java.util.List;

import com.lti.model.InstituteRegistration;
import com.lti.model.Scholarship;
import com.lti.model.Status;
import com.lti.model.StudentRegistration;
import com.lti.model.Users;

public interface Ministry {
	void readLogin(String username, String password);
	List<StudentRegistration> fetchStudentByStudentCode();
	List<StudentRegistration> readStudentApplications();
	Status approveStudentStatus();
	List<InstituteRegistration> fetchInstituteByInstituteCode();
	List<InstituteRegistration> readInstituteApplications();
	Status approveInstituteStatus();
//	public Scholarship addScholarshipDetails();
	void readScholarshipDetails();
	int ministryRegistration(Users users);
}

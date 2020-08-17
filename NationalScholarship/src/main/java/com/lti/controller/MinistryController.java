package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.lti.model.InstituteRegistration;
import com.lti.model.Status;
import com.lti.model.StudentRegistration;
import com.lti.model.Users;
import com.lti.service.MinistryService;
import com.lti.service.MinistryServiceImplementation;

@Controller
public class MinistryController {
	
	@Autowired
	MinistryService ministryService;
	
	public void readLogin(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	public List<StudentRegistration> fetchStudentByStudentCode() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<StudentRegistration> readStudentApplications() {
		// TODO Auto-generated method stub
		return null;
	}

	public Status approveStudentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InstituteRegistration> fetchInstituteByInstituteCode() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InstituteRegistration> readInstituteApplications() {
		// TODO Auto-generated method stub
		return null;
	}

	public Status approveInstituteStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void readScholarshipDetails() {
		// TODO Auto-generated method stub
		
	}

	public int ministryRegistration(Users users) {
		return ministryService.ministryRegistration(users);
		
	}

	
}

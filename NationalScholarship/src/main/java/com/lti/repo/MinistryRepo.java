package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.InstituteRegistration;
import com.lti.model.Status;
import com.lti.model.StudentRegistration;
import com.lti.model.Users;

@Repository
public class MinistryRepo implements Ministry {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void readLogin(String username, String password) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public List<StudentRegistration> fetchStudentByStudentCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<StudentRegistration> readStudentApplications() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Transactional
	public Status approveStudentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Transactional
	public List<InstituteRegistration> fetchInstituteByInstituteCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<InstituteRegistration> readInstituteApplications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Status approveInstituteStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void readScholarshipDetails() {
		// TODO Auto-generated method stub

	}

	@Transactional
	public int ministryRegistration(Users users) {
		Users u = em.merge(users);
		return u.getUserId();
	}

}

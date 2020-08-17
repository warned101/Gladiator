package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
	@Id
	@SequenceGenerator(name = "seq_users", initialValue=20201,allocationSize=1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_users")
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ROLE")
	private String role;
	
	@Column(name="ROLE_ID")
	private int roleId;
	
	@OneToOne(mappedBy="users", cascade=CascadeType.ALL)
	private InstituteRegistration instituteRegistration;
	
	@OneToOne(mappedBy="users", cascade=CascadeType.ALL)
	private StudentRegistration studentRegistration;

	

	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public int getRoleId() {
		return roleId;
	}



	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}



	public InstituteRegistration getInstituteRegistration() {
		return instituteRegistration;
	}



	public void setInstituteRegistration(InstituteRegistration instituteRegistration) {
		this.instituteRegistration = instituteRegistration;
	}



	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}



	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}



	@Override
	public String toString() {
		return "Users [userId=" + userId + ", password=" + password + ", role=" + role + ", roleId=" + roleId + "]";
	}
	
}

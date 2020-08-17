package com.lti.model;

import java.time.LocalDate;

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
@Table(name="STUDENT_ACADEMIC")
public class StudentAcademicDetails {

	
	@Id
	@SequenceGenerator(name = "seq_acedemic", initialValue = 3000,allocationSize=1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_acedemic")
	@Column(name="ID")
	private int academicId;
	
	@Column(name="INSTITUTE_NAME")
	private String instituteName;
	
	@Column(name="PRESENT_COURSE")
	private String presentCourse;
	
	@Column(name="PRESENT_COURSE_YEAR")
	private int presentCourseYear;
	
	@Column(name="MODE_OF_STUDY")
	private String modeOfStudy;
	
	@Column(name="CLASS_START_DATE")
	private LocalDate classStartDate;
	
	@Column(name="UNIVERSITY_NAME")
	private String universityName;
	
	@Column(name="PREVIOUS_COURSE")
	private String previousCourse;
	
	@Column(name="PREVIOUS_PASSING_YEAR")
	private int previousPassingYear;
	
	@Column(name="PREVIOUS_CLASS_PERCENTAGE")
	private double previousClassPercentage;
	
	@Column(name="ROLL_NO_10")
	private String rollNoTenth;
	
	@Column(name="BOARD_NAME_10")
	private String boardNameTenth;
	
	@Column(name="PASSING_YEAR_10")
	private int passingYearTenth;
	
	@Column(name="MARKS_10")
	private double marksTenth;
	
	@Column(name="ROLL_NO_12")
	private String rollNoTwelth;
	
	@Column(name="BOARD_NAME_12")
	private String boardNameTwelth;

	@Column(name="PASSING_YEAR_12")
	private int passingYearTwelth;
	
	@Column(name="MARKS_12")
	private double marksTwelth;
	
	@Column(name="ADMISSION_FEE")
	private long admissionFee;
	
	@Column(name="TUTION_FEE")
	private long tuitionFee;
	
	@Column(name="OTHER_FEE")
	private long otherFee;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentRegistration studentRegistration;

	public int getAcademicId() {
		return academicId;
	}

	public void setAcademicId(int academicId) {
		this.academicId = academicId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getPresentCourse() {
		return presentCourse;
	}

	public void setPresentCourse(String presentCourse) {
		this.presentCourse = presentCourse;
	}

	public int getPresentCourseYear() {
		return presentCourseYear;
	}

	public void setPresentCourseYear(int presentCourseYear) {
		this.presentCourseYear = presentCourseYear;
	}

	public String getModeOfStudy() {
		return modeOfStudy;
	}

	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}

	public LocalDate getClassStartDate() {
		return classStartDate;
	}

	public void setClassStartDate(LocalDate classStartDate) {
		this.classStartDate = classStartDate;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getPreviousCourse() {
		return previousCourse;
	}

	public void setPreviousCourse(String previousCourse) {
		this.previousCourse = previousCourse;
	}

	public int getPreviousPassingYear() {
		return previousPassingYear;
	}

	public void setPreviousPassingYear(int previousPassingYear) {
		this.previousPassingYear = previousPassingYear;
	}

	public double getPreviousClassPercentage() {
		return previousClassPercentage;
	}

	public void setPreviousClassPercentage(double previousClassPercentage) {
		this.previousClassPercentage = previousClassPercentage;
	}

	public String getRollNoTenth() {
		return rollNoTenth;
	}

	public void setRollNoTenth(String rollNoTenth) {
		this.rollNoTenth = rollNoTenth;
	}

	public String getBoardNameTenth() {
		return boardNameTenth;
	}

	public void setBoardNameTenth(String boardNameTenth) {
		this.boardNameTenth = boardNameTenth;
	}

	public int getPassingYearTenth() {
		return passingYearTenth;
	}

	public void setPassingYearTenth(int passingYearTenth) {
		this.passingYearTenth = passingYearTenth;
	}

	public double getMarksTenth() {
		return marksTenth;
	}

	public void setMarksTenth(double marksTenth) {
		this.marksTenth = marksTenth;
	}

	public String getRollNoTwelth() {
		return rollNoTwelth;
	}

	public void setRollNoTwelth(String rollNoTwelth) {
		this.rollNoTwelth = rollNoTwelth;
	}

	public String getBoardNameTwelth() {
		return boardNameTwelth;
	}

	public void setBoardNameTwelth(String boardNameTwelth) {
		this.boardNameTwelth = boardNameTwelth;
	}

	public int getPassingYearTwelth() {
		return passingYearTwelth;
	}

	public void setPassingYearTwelth(int passingYearTwelth) {
		this.passingYearTwelth = passingYearTwelth;
	}

	public double getMarksTwelth() {
		return marksTwelth;
	}

	public void setMarksTwelth(double marksTwelth) {
		this.marksTwelth = marksTwelth;
	}

	public long getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(long admissionFee) {
		this.admissionFee = admissionFee;
	}

	public long getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(long tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public long getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(long otherFee) {
		this.otherFee = otherFee;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	@Override
	public String toString() {
		return "StudentAcademicDetails [academicId=" + academicId + ", instituteName=" + instituteName
				+ ", presentCourse=" + presentCourse + ", presentCourseYear=" + presentCourseYear + ", modeOfStudy="
				+ modeOfStudy + ", classStartDate=" + classStartDate + ", universityName=" + universityName
				+ ", previousCourse=" + previousCourse + ", previousPassingYear=" + previousPassingYear
				+ ", previousClassPercentage=" + previousClassPercentage + ", rollNoTenth=" + rollNoTenth
				+ ", boardNameTenth=" + boardNameTenth + ", passingYearTenth=" + passingYearTenth + ", marksTenth="
				+ marksTenth + ", rollNoTwelth=" + rollNoTwelth + ", boardNameTwelth=" + boardNameTwelth
				+ ", passingYearTwelth=" + passingYearTwelth + ", marksTwelth=" + marksTwelth + ", admissionFee="
				+ admissionFee + ", tuitionFee=" + tuitionFee + ", otherFee=" + otherFee + "]";
	}
	
}
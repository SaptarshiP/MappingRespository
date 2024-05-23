package com.psja.manytomany.model;

public class StudentRequest {

	private String studentId;
	private String studentName;
	private String studentAddress;
	private String studentClassName;
	private String studentSection;
	
	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId( String studentId ) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName( String studentName ) {
		this.studentName = studentName;
	}
	
	public String getStudentAddress() {
		return this.studentAddress;
	}
	public void setStudentAddress( String studentAddress ) {
		this.studentAddress = studentAddress;
	}
	
	public String getStudentClassName() {
		return this.studentClassName;
	}
	public void setStudentClassName( String studentClassName ) {
		this.studentClassName = studentClassName;
	}
	
	public String getStudentSection() {
		return this.studentSection;
	}
	public void setStudentSection( String studentSection ) {
		this.studentSection = studentSection;
	}
}

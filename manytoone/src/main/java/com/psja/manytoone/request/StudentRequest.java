package com.psja.manytoone.request;

public class StudentRequest {

	private String studentAddress;
	private String studentIdentity;
	private String studentName;
	private String studentClass;
	private String studentId;
	private String studentSection;
	
	public String getStudentAddress() {
		return this.studentAddress;
	}
	public void setStudentAddress( String studentAddress ) {
		this.studentAddress = studentAddress;
	}
	
	public String getStudentIdentity() {
		return this.studentIdentity;
	}
	public void setStudentIdentity( String studentIdentity ) {
		this.studentIdentity = studentIdentity;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName( String studentName ) {
		this.studentName = studentName;
	}
	
	public String getStudentClass() {
		return this.studentClass;
	}
	public void setStudentClass( String studentClass ) {
		this.studentClass = studentClass;
	}
	
	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId( String studentId ) {
		this.studentId = studentId;
	}
	
	public String getStudentSection() {
		return this.studentSection;
	}
	public void setStudentSection( String studentSection ) {
		this.studentSection = studentSection;
	}
}

package com.psja.manytomany.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;

@Entity
@Table(name = "STUDENT_ENTITY")
public class StudentEntity implements Serializable{

	@EmbeddedId
	@Column(name = "sid")
	private StudentIdentity studentIdentity;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_address")
	private String studentAddress;

	public StudentIdentity getStudentIdentity() {
		return this.studentIdentity;
	}
	public void setStudentIdentity( StudentIdentity studentIdentity ) {
		this.studentIdentity = studentIdentity;
	}
	
	public String getStudentName(){
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
}

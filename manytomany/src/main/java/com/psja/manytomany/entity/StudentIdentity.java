package com.psja.manytomany.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

import java.util.UUID;

import jakarta.persistence.Column;

@Embeddable
public class StudentIdentity implements Serializable{

	@Column(name = "student_id")
	private String studentId;
	@Column(name = "student_class_name")
	private String studentClassName;
	@Column( name = "student_section" )
	private String studentSection;
	
	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId( String studentId ) {
		this.studentId = studentId;
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

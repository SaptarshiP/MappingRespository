package com.psja.manytomany.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;

@Entity
@Table(name = "COURSE_MANY")
public class CourseEntity implements Serializable{

	@Id
	@Column(name = "course_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;
	@Column(name = "course_name")
	private String courseName;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<EmployeeEntity> empList;
	
	public Integer getCourseId() {
		return this.courseId;
	}
	public void setCourseId( Integer couseId ) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName( String courseName ) {
		this.courseName = courseName;
	}
	
	public List<EmployeeEntity> getEmpList(){
		return this.empList;
	}
	public void setEmpList( List<EmployeeEntity> empList ) {
		this.empList = empList;
	}
}

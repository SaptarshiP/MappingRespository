package com.psja.manytomany.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "EMPLOYEE_MANY")
public class EmployeeEntity implements Serializable{

	@Id
	@Column( name="emp_id" )
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Integer id;
	@Column( name = "emp_name" )
	private String empName;
	@Column( name = "empAddress" )
	private String empAddress;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( name="employee_course", joinColumns = @JoinColumn( name ="emp_id" ),
					inverseJoinColumns = @JoinColumn(name = "course_id") )
	private List<CourseEntity> courseEntity;
	
	public void setId( Integer id ) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	
	public void setEmpName( String empName ) {
		this.empName = empName;
	}
	public String getEmpName() {
		return this.empName;
	}
	
	public String getEmpAddress() {
		return this.empAddress;
	}
	public void setEmpAddress( String empAddress ) {
		this.empAddress = empAddress;
	}
	
	public List<CourseEntity> getCouseEntity(){
		return this.courseEntity;
	}
	public void setCouseEntity( List<CourseEntity> courseEntity ) {
		this.courseEntity = courseEntity;
	}
}

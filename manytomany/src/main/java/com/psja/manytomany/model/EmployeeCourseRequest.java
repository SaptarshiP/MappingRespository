package com.psja.manytomany.model;

import java.util.List;

public class EmployeeCourseRequest {

	private String empName;
	private String empAddress;
	private List<Course> couseList;
	
	public String getEmpName() {
		return this.empName;
	}
	public void setEmpName( String empName ) {
		this.empName = empName;
	}
	
	public String getEmpAddress() {
		return this.empAddress;
	}
	public void setEmpAddress( String empAddress ) {
		this.empAddress = empAddress;
	}
	
	public List<Course> getCourseList(){
		return this.couseList;
	}
	public void setCourseList( List<Course> courseList ) {
		this.couseList = courseList;
	}
	
	public static class Course{
		private String courseName;
		
		public String getCourseName() {
			return this.courseName;
		}
		public void setCourseName( String courseName ) {
			this.courseName = courseName;
		}
	}
}

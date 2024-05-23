package com.psja.manytomany.service;

import com.psja.manytomany.model.EmployeeCourseRequest;

public interface ApplicationService {

	public void executeManyToMany( EmployeeCourseRequest employeeCourseRequest )throws Exception;
	
}

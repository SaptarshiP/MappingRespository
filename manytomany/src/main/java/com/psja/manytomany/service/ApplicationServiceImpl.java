package com.psja.manytomany.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.psja.manytomany.assembler.ApplicationAssembler;
import com.psja.manytomany.entity.EmployeeEntity;
import com.psja.manytomany.model.EmployeeCourseRequest;
import com.psja.manytomany.repo.EmployeeRepo;

@Service
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	private ApplicationAssembler applicationAssembler;
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public void executeManyToMany( EmployeeCourseRequest employeeCourseRequest )throws Exception {
		
		EmployeeEntity employeeEntity = applicationAssembler.toDomain(employeeCourseRequest);
		employeeRepo.save( employeeEntity );
	}
	
}

package com.psja.manytoone.service;

import jakarta.persistence.EntityManager;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.psja.manytoone.assembler.ApplicationAssembler;
import com.psja.manytoone.entity.EmployeeEntity;
import com.psja.manytoone.repo.AppRepository;
import com.psja.manytoone.repo.AppRepositoryImpl;
import com.psja.manytoone.request.SaveRequest;

@Service("ApplicationServiceImpl")
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	private EntityManager em;
	@Autowired
	private ApplicationAssembler applicationAssembler;
	@Autowired
	private EmployeeEntity employeeEntity;
	@Autowired
	private AppRepository<EmployeeEntity, String> appRepository;
	
	
	//public ApplicationServiceImpl() {
		
	//}
	
	@Override
	public void save( SaveRequest saveRequest )throws Exception{
		
		//this.appRepository = new AppRepositoryImpl<EmployeeEntity, Integer>( EmployeeEntity.class, em );
		EmployeeEntity employeeEntity = this.applicationAssembler.toDomainObj(saveRequest);
		this.appRepository.save( employeeEntity );
	}
	
}

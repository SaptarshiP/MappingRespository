package com.psja.onetoone.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.psja.onetoone.assembler.ApplicationAssembler;
import com.psja.onetoone.entity.EmployeeEntity;
import com.psja.onetoone.entity.UserEntity;
import com.psja.onetoone.repo.AppRepository;
import com.psja.onetoone.repo.UserRepository;
import com.psja.onetoone.request.SaveRequestDTO;
import com.psja.onetoone.request.SaveUserRelationshipDTO;

@Service
public class BaseApplicationService implements ApplicationService{

	@Autowired
	private ApplicationAssembler applicationAssembler;
	@Autowired
	private AppRepository appRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String saveData( SaveRequestDTO saveRequestDTO ) {
		
		EmployeeEntity employeeEntity = applicationAssembler.fromDomainOneToOne(saveRequestDTO);
		
		appRepository.save( employeeEntity );
		return null;
	}
	
	@Override
	public String saveRelationShipData( SaveUserRelationshipDTO saveUserRelationshipDTO ) {
		
		UserEntity userEntity = applicationAssembler.fromDomainOneToOne(saveUserRelationshipDTO);
		
		userRepository.save( userEntity );
		return null;
	}
	
}

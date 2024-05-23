package com.psja.onetoone.assembler;

import org.springframework.stereotype.Component;

import com.psja.onetoone.entity.AddressEntity;
import com.psja.onetoone.entity.EmployeeEntity;
import com.psja.onetoone.entity.RelationShipEntity;
import com.psja.onetoone.entity.UserEntity;
import com.psja.onetoone.request.SaveRequestDTO;
import com.psja.onetoone.request.SaveUserRelationshipDTO;

@Component
public class ApplicationAssembler {

	public EmployeeEntity fromDomainOneToOne( SaveRequestDTO saveRequestDTO ) {
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmpName( saveRequestDTO.getEmpName() );
		employeeEntity.setEmpFatherName( saveRequestDTO.getEmpFatherName() );
		employeeEntity.setEmpMotherName( saveRequestDTO.getEmpMotherName() );
		
		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setLaneName( saveRequestDTO.getAddress().getLaneName() );
		addressEntity.setLaneNumber( saveRequestDTO.getAddress().getLaneNumber() );
		addressEntity.setEmployeeEntity(employeeEntity);
		
		employeeEntity.setAddressEntity( addressEntity );
		return employeeEntity;
	}
	
	public UserEntity fromDomainOneToOne( SaveUserRelationshipDTO saveUserRelationshipDTO ) {
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUserAddress( saveUserRelationshipDTO.getUserAddress() );
		userEntity.setUserName( saveUserRelationshipDTO.getUserName() );
		
		RelationShipEntity relationShipEntity = new RelationShipEntity();
		relationShipEntity.setRelationShipName( saveUserRelationshipDTO.getRelationShip().getRelationShipName() );
		relationShipEntity.setRelationShipType( saveUserRelationshipDTO.getRelationShip().getRelationShipType() );
		relationShipEntity.setUserEntity(userEntity);
		
		userEntity.setRelationShipEntity(relationShipEntity);
		
		return userEntity;
		
	}
	
}

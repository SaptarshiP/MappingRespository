package com.psja.manytoone.assembler;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.psja.manytoone.entity.EmployeeEntity;
import com.psja.manytoone.entity.RelationshipEntity;
import com.psja.manytoone.request.SaveRequest;
import com.psja.manytoone.request.StudentRequest;

@Component
public class ApplicationAssembler {

	public EmployeeEntity toDomainObj( SaveRequest saveRequest ) {
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmpName( saveRequest.getEmpName() );
		employeeEntity.setEmpAddress( saveRequest.getEmpAddress() );
		
		List<RelationshipEntity> relationShipEntityList = new ArrayList<>(); 
		saveRequest.getRelationShipList().forEach(data->{
			RelationshipEntity relationShipEntity = new RelationshipEntity();
			relationShipEntity.setRelationShipName( data.getRelationShipName() );
			relationShipEntity.setRelationShipTitle( data.getRelationShpTitle() );
			relationShipEntity.setEmployeeEntity(employeeEntity);
			relationShipEntityList.add( relationShipEntity );
		});
		
		employeeEntity.setRelationShipEntityList(relationShipEntityList);
		
		return employeeEntity;
	}
	
	
	
}

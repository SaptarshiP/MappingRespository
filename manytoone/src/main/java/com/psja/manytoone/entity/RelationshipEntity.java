package com.psja.manytoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.util.UUID;

import jakarta.persistence.CascadeType;

@Entity
@Table(name = "relationship_entity")
public class RelationshipEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "relationship_id")
	private String relationShipId = UUID.randomUUID().toString();
	@Column( name = "relationship_name" )
	private String relationShipName;
	@Column( name = "relationship_title" )
	private String relationShipTitle;
	
	@ManyToOne( cascade = CascadeType.ALL )
	@JoinColumn( name = "employeeEntity", referencedColumnName = "emp_id" )
	private EmployeeEntity employeeEntity;
	
	public String getRelationShipId() {
		return this.relationShipId;
	}
	public void setRelationShipId( String relationShipId ) {
		this.relationShipId = relationShipId;
	}
	
	public String getRelationShipName() {
		return this.relationShipName;
	}
	public void setRelationShipName( String relationShipName ) {
		this.relationShipName = relationShipName;
	}
	
	public String getRelationShipTitle() {
		return this.relationShipTitle;
	}
	public void setRelationShipTitle( String relationShipTitle ) {
		this.relationShipTitle = relationShipTitle;
	}
	
	public EmployeeEntity getEmployeeEntity() {
		return this.employeeEntity;
	}
	public void setEmployeeEntity( EmployeeEntity employeeEntity ) {
		this.employeeEntity = employeeEntity;
	}
}

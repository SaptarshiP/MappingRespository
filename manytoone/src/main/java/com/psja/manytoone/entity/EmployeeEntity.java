package com.psja.manytoone.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;

@Entity
@Table( name = "EMPLOYEE_ENTITY" )
public class EmployeeEntity implements Serializable{

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name = "emp_id" )
	private String empId = UUID.randomUUID().toString();
	@Column( name = "emp_name" )
	private String empName;
	@Column( name = "emp_address" )
	private String empAddress;
	
	@OneToMany(mappedBy = "employeeEntity", cascade = CascadeType.ALL)
	private List<RelationshipEntity> relationShipEntityList;
	
	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId( String empId ) {
		this.empId = empId;
	}
	
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
	
	public List<RelationshipEntity> getRelationShipEntityList(){
		return this.relationShipEntityList;
	}
	public void setRelationShipEntityList( List<RelationshipEntity> relationShipEntityList ) {
		this.relationShipEntityList = relationShipEntityList;
	}
}

package com.psja.manytoone.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveRequest {

	@JsonProperty( value = "emp_id" )
	private String empId;
	@JsonProperty( value = "emp_name" )
	private String empName;
	@JsonProperty( value = "emp_address" )
	private String empAddress;
	@JsonProperty( value = "relationship" )
	private List<RelationShip> relationShipList;
	
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
	
	public List<RelationShip> getRelationShipList(){
		return this.relationShipList;
	}
	public void setRelationShipList( List<RelationShip> relationShipList ) {
		this.relationShipList = relationShipList;
	}
	
	public static class RelationShip{
		
		@JsonProperty( value = "relationship_id" )
		private String relationShipId;
		@JsonProperty( value = "relationship_name" )
		private String relationshipName;
		@JsonProperty( value = "relationship_title" )
		private String relationShipTitle;
		
		public String getRelationShipId() {
			return this.relationShipId;
		}
		public void setRelationShipId( String relationShipId ) {
			this.relationShipId = relationShipId;
		}
		
		public String getRelationShipName() {
			return this.relationshipName;
		}
		public void setRelationShipName( String relationShipName ) {
			this.relationshipName = relationShipName;
		}
		
		public String getRelationShpTitle() {
			return this.relationShipTitle;
		}
		public void setRelationShipTitle( String relationShipTitle ) {
			this.relationShipTitle = relationShipTitle;
		}
	}
}

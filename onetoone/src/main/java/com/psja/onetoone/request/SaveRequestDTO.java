package com.psja.onetoone.request;

public class SaveRequestDTO {

	private String empName;
	private String empFatherName;
	private String empMotherName;
	private Address address;
	
	public class Address{
		private String laneNumber;
		private String laneName;
		
		public String getLaneNumber() {
			return this.laneNumber;
		}
		public void setLaneNumber( String laneNumber ) {
			this.laneNumber = laneNumber;
		}
		
		public String getLaneName() {
			return this.laneName;
		}
		public void setLaneName( String laneName ) {
			this.laneName = laneName;
		}
	}
	
	public void setEmpName( String empName ) {
		this.empName = empName;
	}
	public String getEmpName() {
		return this.empName;
	}
	
	public String getEmpFatherName() {
		return this.empFatherName;
	}
	public void setEmpFatherName( String empFatherName ) {
		this.empFatherName = empFatherName;
	}
	
	public void setEmpMotherName( String empMotherName ) {
		this.empMotherName = empMotherName;
	}
	public String getEmpMotherName() {
		return this.empMotherName;
	}
	
	public Address getAddress() {
		return this.address;
	}
	public void setAddress( Address address ) {
		this.address = address;
	}
}

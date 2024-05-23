package com.psja.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_father_name")
	private String empFatherName;
	@Column(name = "emp_mother_name")
	private String empMotherName;
	@OneToOne( mappedBy = "employee", cascade = CascadeType.ALL )
	private AddressEntity address;
	
	public Integer id() {
		return id;
	}
	public void setId( Integer id ) {
		this.id = id;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	public void setEmpName( String empName ) {
		this.empName = empName;
	}
	
	public String getEmpFatherName( String empFatherName ) {
		return this.empFatherName;
	}
	public void setEmpFatherName( String empFatherName ) {
		this.empFatherName = empFatherName;
	}
	
	public String getEmpMotherName() {
		return this.empMotherName;
	}
	public void setEmpMotherName( String empMotherName ) {
		this.empMotherName = empMotherName;
	}
	
	public AddressEntity getAddressEntity() {
		return this.address;
	}
	public void setAddressEntity( AddressEntity address ) {
		this.address = address;
	}
}

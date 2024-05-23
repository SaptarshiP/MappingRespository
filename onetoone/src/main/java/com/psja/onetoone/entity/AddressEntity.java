package com.psja.onetoone.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table( name = "Address" )
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "lane_name")
	private String laneName;
	@Column(name = "lane_number")
	private String laneNumber;
	
	@JoinColumn( name = "emp_id", referencedColumnName = "id" )
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeEntity employee;
	
	public Integer getId() {
		return this.id;
	}
	public void setId( Integer id ) {
		this.id = id;
	}
	
	public String getLaneName() {
		return this.laneName;
	}
	public void setLaneName( String laneName ) {
		this.laneName = laneName;
	}
	
	public String getLaneNumber( String laneNumber ) {
		return this.laneNumber;
	}
	public void setLaneNumber( String laneNumber ) {
		this.laneNumber = laneNumber;
	}
	
	public EmployeeEntity getEmployeeEntity() {
		return this.employee;
	}
	public void setEmployeeEntity( EmployeeEntity employee ) {
		this.employee = employee;
	}
}

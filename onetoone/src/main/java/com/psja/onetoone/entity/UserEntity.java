package com.psja.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.CascadeType;

@Entity
@Table(name = "User")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column( name = "user_name" )
	private String userName;
	@Column(name = "user_address")
	private String userAddress;
	
	@OneToOne( mappedBy = "userEntity", cascade = CascadeType.ALL )
	@PrimaryKeyJoinColumn
	private RelationShipEntity relationShipEntity;
	
	public Integer getId() {
		return this.id;
	}
	public void setId( Integer id ) {
		this.id = id;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserName( String userName ) {
		this.userName = userName;
	}
	
	public String getUserAddress() {
		return this.userAddress;
	}
	public void setUserAddress( String userAddress ) {
		this.userAddress = userAddress;
	}
	
	public RelationShipEntity getRelationShipEntity() {
		return this.relationShipEntity;
	}
	public void setRelationShipEntity( RelationShipEntity relationShipEntity ) {
		this.relationShipEntity = relationShipEntity;
	}
}

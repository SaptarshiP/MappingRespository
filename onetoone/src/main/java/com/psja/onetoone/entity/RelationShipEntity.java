package com.psja.onetoone.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Id;

@Table(name = "relationship")
@Entity
public class RelationShipEntity {

	@Id
	@Column(name = "relation_ship_id")
	private Integer relationShipId;
	@Column(name = "relation_ship_type")
	private String relationShipType;
	@Column(name = "relation_ship_name")
	private String relationShipName;
	
	@OneToOne
	@MapsId
	@JoinColumn( name = "relation_ship_id")
	private UserEntity userEntity;
	
	public Integer getRelationShipId() {
		return this.relationShipId;
	}
	public void setRelationShipId( Integer relationShipId ) {
		this.relationShipId = relationShipId;
	}
	
	public String getRelationShipType() {
		return this.relationShipType;
	}
	public void setRelationShipType( String relationShipType ) {
		this.relationShipType = relationShipType;
	}
	
	public String getRelationShipName() {
		return this.relationShipName;
	}
	public void setRelationShipName( String relationShipName ) {
		this.relationShipName = relationShipName;
	}
	
	public UserEntity getUserEntity() {
		return this.userEntity;
	}
	public void setUserEntity( UserEntity userEntity ) {
		this.userEntity = userEntity;
	}
	
}

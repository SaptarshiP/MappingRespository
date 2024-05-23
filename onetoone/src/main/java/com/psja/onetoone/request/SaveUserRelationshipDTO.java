package com.psja.onetoone.request;

public class SaveUserRelationshipDTO {

	private String userName;
	private String userAddress;
	private RelationShip relationShip;
	
	public void setUserName( String userName ) {
		this.userName = userName;
	}
	public String getUserName() {
		return this.userName;
	}
	
	public String getUserAddress() {
		return this.userAddress;
	}
	public void setUserAddress( String userAddress ) {
		this.userAddress = userAddress;
	}
	
	public RelationShip getRelationShip() {
		return this.relationShip;
	}
	public void setRelationShip( RelationShip relationShip ) {
		this.relationShip = relationShip;
	}
	
	public class RelationShip{
		private String relationShipType;
		private String relationShipName;
		
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
	}
}

package com.psja.onetoone.service;

import com.psja.onetoone.request.SaveRequestDTO;
import com.psja.onetoone.request.SaveUserRelationshipDTO;

public interface ApplicationService {

	public String saveData(  SaveRequestDTO saveRequestDTO  );
	public String saveRelationShipData( SaveUserRelationshipDTO saveUserRelationshipDTO );
}

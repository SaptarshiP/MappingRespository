package com.psja.onetoone.controller;

import org.springframework.web.bind.annotation.RestController;

import com.psja.onetoone.request.SaveRequestDTO;
import com.psja.onetoone.request.SaveUserRelationshipDTO;
import com.psja.onetoone.service.ApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping( value = "/save_data", method = RequestMethod.GET )
	public String addData(@RequestBody SaveRequestDTO saveRequestDTO) {
		
		applicationService.saveData(saveRequestDTO);
		return null;
	}
	
	@RequestMapping( value = "/save_relationship", method = RequestMethod.GET )
	public String saveRelationship( @RequestBody SaveUserRelationshipDTO saveUserRelationshipDTO ) {
		applicationService.saveRelationShipData(saveUserRelationshipDTO);
		return null;
	}
	
}

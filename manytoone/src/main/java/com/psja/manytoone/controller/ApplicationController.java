package com.psja.manytoone.controller;

import com.psja.manytoone.request.SaveRequest;
import com.psja.manytoone.request.StudentRequest;
import com.psja.manytoone.service.ApplicationService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
		
	@RequestMapping( value = "/save_method", method = RequestMethod.POST )
	public ResponseEntity<String> saveMethod( @RequestBody SaveRequest saveRequest  )throws Exception{
		applicationService.save(saveRequest);
		return null;
	}
	
	

}

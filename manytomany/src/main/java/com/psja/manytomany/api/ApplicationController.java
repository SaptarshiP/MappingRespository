package com.psja.manytomany.api;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

import com.psja.manytomany.model.EmployeeCourseRequest;
import com.psja.manytomany.model.StudentRequest;
import com.psja.manytomany.service.ApplicationService;
import com.psja.manytomany.service.StudentService;

@RestController
@RequestMapping(value="/manyToMany")
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping( value="/", method = RequestMethod.GET )
	public ResponseEntity<String> checkManyToMany( @RequestBody EmployeeCourseRequest employeeCourseRequest  ){
		
		try {
			applicationService.executeManyToMany(employeeCourseRequest);
		} catch( Exception exp ) {
			System.out.println( exp.getMessage() );
		}
		return null;
	}
	
	@RequestMapping( value = "/save", method = RequestMethod.POST )
	public ResponseEntity<String> checkEmbedded( @RequestBody StudentRequest studentRequest ){
		try {
			studentService.save(studentRequest);
		}catch( Exception exp ) {
			System.out.println( exp.getMessage() );
		}
		return null;
	}
	
	@RequestMapping( value = "/get_data", method = RequestMethod.GET )
	public ResponseEntity<List<StudentRequest>> getStudentData( @RequestParam("STUDENT_CLASS_NAME")String studentClassName ){
		
		List<StudentRequest> studentRequestList = new ArrayList<>();
		try {
			studentRequestList = studentService.retrieveStudentByStudentName(studentClassName);
		} catch( Exception exp ) {
			System.out.println( exp.getMessage() );
		}
		return ResponseEntity.status(200).contentType(MediaType.APPLICATION_JSON).body( studentRequestList );
	}
}

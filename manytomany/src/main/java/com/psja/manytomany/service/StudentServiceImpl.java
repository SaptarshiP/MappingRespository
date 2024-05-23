package com.psja.manytomany.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.psja.manytomany.assembler.ApplicationAssembler;
import com.psja.manytomany.entity.StudentEntity;
import com.psja.manytomany.model.StudentRequest;
import com.psja.manytomany.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private ApplicationAssembler applicationAssembler;
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void save( StudentRequest studentRequest )throws Exception{
		StudentEntity studentEntity = applicationAssembler.toDomain(studentRequest);
		studentRepository.save( studentEntity );
	}
	
	@Override
	public List<StudentRequest> retrieveStudentByStudentName( String studentClassName )throws Exception{
		
		List<StudentEntity> studentEntityList = studentRepository.findByIdStudentClassName(studentClassName);
		List<StudentRequest> studentRequestList = new ArrayList<>();
		for ( StudentEntity student: studentEntityList ) {
			StudentRequest studentRequest = applicationAssembler.fromDomain(student);
			studentRequestList.add( studentRequest );
		}  
		
		return studentRequestList;
	}
	
}

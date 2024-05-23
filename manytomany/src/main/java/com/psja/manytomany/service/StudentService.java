package com.psja.manytomany.service;

import java.util.List;

import com.psja.manytomany.model.StudentRequest;

public interface StudentService {

	public void save( StudentRequest studentRequest )throws Exception;
	public List<StudentRequest> retrieveStudentByStudentName( String studentClassName )throws Exception;
}

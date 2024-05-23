package com.psja.manytomany.assembler;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.psja.manytomany.entity.CourseEntity;
import com.psja.manytomany.entity.EmployeeEntity;
import com.psja.manytomany.entity.StudentEntity;
import com.psja.manytomany.entity.StudentIdentity;
import com.psja.manytomany.model.EmployeeCourseRequest;
import com.psja.manytomany.model.StudentRequest;

@Component
public class ApplicationAssembler {

	public EmployeeEntity toDomain( EmployeeCourseRequest employeeCourseRequest ) {
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmpName( employeeCourseRequest.getEmpName() );
		employeeEntity.setEmpAddress( employeeCourseRequest.getEmpAddress() );

		//List<EmployeeEntity> empEntityList = new ArrayList<>();
		//empEntityList.add( employeeEntity );
		List<CourseEntity> courseEntityList = new ArrayList<>(); 
		for ( EmployeeCourseRequest.Course course: employeeCourseRequest.getCourseList() ) {
			CourseEntity courseEntity = new CourseEntity();
			courseEntity.setCourseName( course.getCourseName() );
			//courseEntity.setEmpList(empEntityList);
			
			courseEntityList.add( courseEntity );
		}
		employeeEntity.setCouseEntity(courseEntityList);
		
		return employeeEntity;
	}
	
	public StudentEntity toDomain( StudentRequest studentRequest ) {
		
		StudentIdentity studentIdentity = new StudentIdentity();
		studentIdentity.setStudentId( studentRequest.getStudentId() );
		studentIdentity.setStudentClassName( studentRequest.getStudentClassName() );
		studentIdentity.setStudentSection( studentRequest.getStudentSection() );
		
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setStudentIdentity(studentIdentity);
		studentEntity.setStudentAddress( studentRequest.getStudentAddress() );
		studentEntity.setStudentName( studentRequest.getStudentName() );
		
		return studentEntity;
	}
	
	public StudentRequest fromDomain( StudentEntity studentEntity ) {
		
		StudentRequest studentRequest = new StudentRequest();
		studentRequest.setStudentId( studentEntity.getStudentIdentity().getStudentId() );
		studentRequest.setStudentName( studentEntity.getStudentName() );
		studentRequest.setStudentAddress( studentEntity.getStudentAddress() );
		studentRequest.setStudentClassName( studentEntity.getStudentIdentity().getStudentClassName() );
		studentRequest.setStudentSection( studentEntity.getStudentIdentity().getStudentSection() );
		
		return studentRequest;
	}
}

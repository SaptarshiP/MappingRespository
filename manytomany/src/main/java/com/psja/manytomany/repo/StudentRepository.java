package com.psja.manytomany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.psja.manytomany.entity.StudentEntity;
import com.psja.manytomany.entity.StudentIdentity;

public interface StudentRepository extends JpaRepository< StudentEntity, StudentIdentity >{

	//@Query(value = "select o.student_class_name,o.student_id,o.student_section,o.student_address,o.student_name from student_entity o where o.student_class_name = :STUDENT_CLASS_NAME", nativeQuery = true)
	
	@Query(value = "select o from StudentEntity o where o.studentIdentity.studentClassName = :STUDENT_CLASS_NAME")
	public List<StudentEntity> findByIdStudentClassName( @Param("STUDENT_CLASS_NAME")String studentClassName );
	
}

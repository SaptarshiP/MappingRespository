package com.psja.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psja.onetoone.entity.EmployeeEntity;

public interface AppRepository extends JpaRepository<EmployeeEntity, Integer>{

	
}

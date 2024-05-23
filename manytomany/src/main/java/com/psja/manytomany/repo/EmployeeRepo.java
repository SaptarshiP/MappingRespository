package com.psja.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psja.manytomany.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

}

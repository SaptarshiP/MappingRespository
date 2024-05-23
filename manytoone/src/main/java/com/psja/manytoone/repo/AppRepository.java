package com.psja.manytoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psja.manytoone.entity.EmployeeEntity;

@Repository
public interface AppRepository<P, K> extends JpaRepository<P, K>{

}

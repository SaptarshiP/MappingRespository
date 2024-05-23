package com.psja.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psja.onetoone.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}

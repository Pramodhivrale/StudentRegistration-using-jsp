package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.StudentEntity;

public interface Repository extends JpaRepository<StudentEntity, Integer>{

}

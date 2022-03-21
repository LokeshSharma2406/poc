package com.example.poc.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.poc.entity.EmployeeEntity;

@Transactional
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}

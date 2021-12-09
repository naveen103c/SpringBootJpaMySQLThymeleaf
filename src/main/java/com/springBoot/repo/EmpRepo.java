package com.springBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.model.Employee;


public interface EmpRepo extends JpaRepository<Employee, Long>{

}

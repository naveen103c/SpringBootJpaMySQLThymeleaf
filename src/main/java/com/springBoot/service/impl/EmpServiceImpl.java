package com.springBoot.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springBoot.model.Employee;
import com.springBoot.repo.EmpRepo;
import com.springBoot.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpRepo empRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}
	@Override
	public Employee getEmployeeById(long id) {
		return empRepo.getById(id);
	}

	

}

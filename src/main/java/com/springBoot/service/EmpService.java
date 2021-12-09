package com.springBoot.service;

import java.util.List;

import com.springBoot.model.Employee;

public interface EmpService {
	List<Employee> getAllEmployees();

	Employee getEmployeeById(long id);

}

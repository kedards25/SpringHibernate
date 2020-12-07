package com.learning.springhibernatedemo.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.springhibernatedemo.models.EmployeeModel;

@Component
public interface IEmployeeDao {

	List<EmployeeModel> getAllEmployees();
	
	EmployeeModel getEmployeeById(int employeeId);
	
	boolean addEmployee(EmployeeModel model);
	
	boolean updateEmployee(EmployeeModel model);
	
	void deleteEmployee(int employeeId);
	
	
}

package com.soringboot.jpa.mysql.service;

import java.util.List;

import com.soringboot.jpa.mysql.Employee;

public interface EmployeeService 
{
	Employee findEmployee(Integer id);
	
	Employee createEmployee(Employee employee);
	
	List<Employee> findAllEmployee();
	
	Employee updateEmployee(Employee employee);
	void deleteEmployee(Integer id);
	

}

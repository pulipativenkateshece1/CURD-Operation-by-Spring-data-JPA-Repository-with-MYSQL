package com.soringboot.jpa.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soringboot.jpa.mysql.Employee;
import com.soringboot.jpa.mysql.service.EmployeeService;

@RestController
public class EmployeeRestController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("findEmployee")
	public Employee findEmployee(@RequestBody Employee employee)
	{
		return employeeService.findEmployee(employee.getId());
	}
	@PostMapping("createEmployee")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeService.createEmployee(employee);
	}
	@GetMapping("findAllEmployee")
	public List<Employee> findAllEmployee()
	{
		return employeeService.findAllEmployee();
	}
	@PutMapping("updateEmployee")
	public  Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("deleteEmployee/{id}")
	public void deleteEmployee( @PathVariable Integer id)
	{
		employeeService.deleteEmployee(id);
	}
	

}
 
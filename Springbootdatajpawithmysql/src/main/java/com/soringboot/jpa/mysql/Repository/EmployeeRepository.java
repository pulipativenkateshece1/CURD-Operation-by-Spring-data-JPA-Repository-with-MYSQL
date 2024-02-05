package com.soringboot.jpa.mysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soringboot.jpa.mysql.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

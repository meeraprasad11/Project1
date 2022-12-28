package com.sixdee.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sixdee.task.model.Employee;


public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	
}

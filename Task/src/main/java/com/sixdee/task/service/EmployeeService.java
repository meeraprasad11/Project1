package com.sixdee.task.service;

import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;

import com.sixdee.task.bean.RequestBean;
import com.sixdee.task.model.Employee;

@Service
public interface EmployeeService
{
	Employee saveEmployee(RequestBean hc) throws NoSuchAlgorithmException;
	

	
}

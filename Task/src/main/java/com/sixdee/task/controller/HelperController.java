package com.sixdee.task.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.task.bean.RequestBean;
import com.sixdee.task.service.EmployeeService;

@RestController
public class HelperController {

	@Autowired
	private EmployeeService empService;

	@PostMapping(value = "/insert")
	public String getRequest(@RequestBody RequestBean hc) throws NoSuchAlgorithmException {
		empService.saveEmployee(hc);
		return "Success";
	}

//	@PostMapping(value="/insert")
//	public String getResults(@RequestBody Employee_addressBean employeeaddressbean)
//	{
//		System.out.println(employeeaddressbean);
//		
//		Employee_address empa = helperclass.getResult(employeeaddressbean);
//		empAddressService.saveEmployee(empa);
//		return "success";
//		
//	}

}

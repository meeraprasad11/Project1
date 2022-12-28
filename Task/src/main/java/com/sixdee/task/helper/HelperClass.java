package com.sixdee.task.helper;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.task.bean.Employee_addressBean;
import com.sixdee.task.bean.RequestBean;
import com.sixdee.task.model.Employee;
import com.sixdee.task.model.Employee_address;
import com.sixdee.task.model.Employee_details;
import com.sixdee.task.model.project;

@Service
public class HelperClass {

	public void getmethod(RequestBean requestbean) {
		System.out.println(requestbean);
		System.out.println("halo");
	}

	public String md(String password) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] messageDigest = md.digest(password.getBytes());
		BigInteger bigint = new BigInteger(1, messageDigest);
		return bigint.toString(16);
	}

	public Employee getRequests(RequestBean requestbean) throws NoSuchAlgorithmException {
		Employee employee = new Employee();

		employee.setName(requestbean.getName());
		System.out.println(employee.getName());

		employee.setEmailid(requestbean.getEmailid());
		System.out.println(employee.getEmailid());

		String val = md(requestbean.getPassword());
		employee.setPassword(val);

//		employeedetails.setAdhar_number(requestbean.getAdhar_number());
//		System.out.println(employeedetails.getAdhar_number());
//		
//		employeedetails.setPan_number(requestbean.getPan_number());
//		System.out.println(employeedetails.getPan_number());

		List<Employee_address> list1 = getResult(requestbean);
		employee.setEmployeeAddress(list1);

		Employee_details employeedetails = storeToEmployeeDetails(requestbean);
		employeedetails.setEmployee(employee);
		employee.setEmployeeDetails(employeedetails);
		System.out.println(employeedetails);

		return employee;

	}

	public List<Employee_address> getResult(RequestBean emabean) {
		Employee_address empa = new Employee_address();

		List<Employee_address> lempa = new ArrayList<Employee_address>();
		List<Employee_addressBean> list = emabean.getEmployeeAddress();

		for (Employee_addressBean a : list) {
			empa.setHouse_no(a.getHouse_no());
			empa.setCity(a.getCity());
			empa.setState(a.getState());
			empa.setNation(a.getNation());
			lempa.add(empa);
		}

		return lempa;

	}

	public Employee_details storeToEmployeeDetails(RequestBean req) {
		Employee_details employeedetails = new Employee_details();
		employeedetails.setAdhar_number(req.getAdhar_number());
		employeedetails.setPan_number(req.getPan_number());
		employeedetails.setDepartment_id(req.getDepartment_id());

		return employeedetails;
	}

//	public List<project> getProject(RequestBean rb)
//	{
//		
//		return null;
//		
//	}
}

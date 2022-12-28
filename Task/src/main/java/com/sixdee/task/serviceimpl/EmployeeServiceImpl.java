package com.sixdee.task.serviceimpl;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.task.bean.RequestBean;
import com.sixdee.task.helper.HelperClass;
import com.sixdee.task.model.Employee;
import com.sixdee.task.repository.EmployeeRepository;
import com.sixdee.task.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private HelperClass helperclass;

	@Override
	public Employee saveEmployee(RequestBean hc) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub

		return employeeRepository.save(helperclass.getRequests(hc));
	}

//	@Override
//	public List<Employee> getAllEmployees() {
//		// TODO Auto-generated method stub
//		return  employeeRepository.findAll();
//	}
//
//	@Override
//	public Employee getEmployeeById(int id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent())
//		{
//			return employee.get();
//		}
//		else
//		{
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
//	}

}

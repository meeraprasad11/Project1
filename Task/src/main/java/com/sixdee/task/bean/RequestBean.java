package com.sixdee.task.bean;

import java.util.List;

public class RequestBean 
{
	private String name;
	private String emailid;
	private String password;
	private String adhar_number;
	private String pan_number;
	private int department_id;
	private List<Employee_addressBean> employeeAddress;
	private List<projectBean> Project;
	public RequestBean() {
		super();
	}
	public RequestBean(String name, String emailid, String password, String adhar_number, String pan_number,int department_id,
			List<Employee_addressBean> employeeAddress, List<projectBean> project) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		this.adhar_number = adhar_number;
		this.pan_number = pan_number;
		this.department_id = department_id;
		this.employeeAddress = employeeAddress;
		this.Project = project;
	}
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdhar_number() {
		return adhar_number;
	}
	public void setAdhar_number(String adhar_number) {
		this.adhar_number = adhar_number;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public List<Employee_addressBean> getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(List<Employee_addressBean> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public List<projectBean> getProject() {
		return Project;
	}
	public void setProject(List<projectBean> project) {
		Project = project;
	}
	
	
	@Override
	public String toString() {
		return "RequestBean [name=" + name + ", emailid=" + emailid + ", password=" + password + ", adhar_number="
				+ adhar_number + ", pan_number=" + pan_number + ", employeeAddress=" + employeeAddress + ", Project="
				+ Project + "]";
	}
	
	


		
}

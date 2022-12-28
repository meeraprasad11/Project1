package com.sixdee.task.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_details")
public class Employee_details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "adhar_number")
	private String adhar_number;

	@Column(name = "pan_number")
	private String pan_number;

	@Column(name = "employee_id", insertable = false, updatable = false)
	private int employee_id;

	@Column(name = "department_id")
	private int department_id;

	@OneToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id", referencedColumnName = "id")
	private Employee employee;
	
//	@OneToOne(targetEntity = department.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "department_id",referencedColumnName = "id")
//	private department Department;
//	
//	
//	public Employee_details() {
//		super();
//	}

	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	@Override
	public String toString() {
		return "Employee_details [id=" + id + ", dob=" + dob + ", adhar_number=" + adhar_number + ", pan_number="
				+ pan_number + ", employee_id=" + employee_id + ", department_id=" + department_id + "]";
	}

}

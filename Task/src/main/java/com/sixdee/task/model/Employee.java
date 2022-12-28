package com.sixdee.task.model;

import java.util.List;

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
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "emialid")
	private String emailid;

	@Column(name = "password")
	private String password;

	@Column(name = "wrong_password_attempt")
	private int wrong_password_attempt;

	@Column(name = "is_blocked")
	private boolean is_blocked;

	@OneToMany(targetEntity = Employee_address.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id", referencedColumnName = "id")
	private List<Employee_address> employeeAddress;

//	@OneToOne(targetEntity = Employee_details.class,cascade = CascadeType.ALL)
//	@JoinColumn(name ="ed_fk",referencedColumnName = "id")

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private Employee_details employeeDetails;

//	
	public Employee() {
		super();
	}
//	

	public Employee_details getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(Employee_details employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getWrong_password_attempt() {
		return wrong_password_attempt;
	}

	public void setWrong_password_attempt(int wrong_password_attempt) {
		this.wrong_password_attempt = wrong_password_attempt;
	}

	public boolean isIs_blocked() {
		return is_blocked;
	}

	public void setIs_blocked(boolean is_blocked) {
		this.is_blocked = is_blocked;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password
				+ ", wrong_password_attempt=" + wrong_password_attempt + ", is_blocked=" + is_blocked + "]";
	}

	public List<Employee_address> getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(List<Employee_address> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}

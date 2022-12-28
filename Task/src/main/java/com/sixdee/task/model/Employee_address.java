package com.sixdee.task.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_address")
public class Employee_address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;

	@Column(name = "house_no")
	private String house_no;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "nation")
	private String nation;

	@Column(name = "pin")
	private int pin;

	@Column(name = "employee_id")
	private int employee_id;

	@ManyToOne
	@JoinColumn(name = "employee_id", insertable = false, updatable = false)
	private Employee employee;

//	public Employee_address() {
//		super();
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	@Override
	public String toString() {
		return "Employee_address [id=" + id + ", house_no=" + house_no + ", city=" + city + ", state=" + state
				+ ", nation=" + nation + ", pin=" + pin + ", employee_id=" + employee_id + "]";
	}

}

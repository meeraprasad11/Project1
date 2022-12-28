package com.sixdee.task.bean;

public class Employee_addressBean
{
	
	private String house_no;
	private String city;
	private String state;
	private String nation;
	
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
	
	public Employee_addressBean() {
		super();
	}
	public Employee_addressBean(String house_no, String city, String state, String nation) {
		super();
		this.house_no = house_no;
		this.city = city;
		this.state = state;
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "Employee_addressBean [house_no=" + house_no + ", city=" + city + ", state=" + state + ", nation="
				+ nation + "]";
	}
	
	
	
	
}

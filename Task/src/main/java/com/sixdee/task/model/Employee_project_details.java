package com.sixdee.task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_project_details")
public class Employee_project_details 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="employee_id")
	private int employee_id;
	
	@Column(name="project_id")
	private int project_id;
	
//	@ManyToOne
//	@JoinColumn(name ="employee_id")
//	private Employee employee;
//	
//	@ManyToOne
//	@JoinColumn(name ="project_id")
//	private project Project;
	
	
//	public Employee_project_details() {
//		super();
//	}
//	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}



	@Override
	public String toString() {
		return "Employee_project_details [id=" + id + ", employee_id=" + employee_id + ", project_id=" + project_id
				+ "]";
	}
	
	
}

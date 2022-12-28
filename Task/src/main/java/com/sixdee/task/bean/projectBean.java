package com.sixdee.task.bean;

public class projectBean 
{
	private int project_id;
	

	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	
	public projectBean() {
		super();
	}
	public projectBean(int project_id) {
		super();
		this.project_id = project_id;
		
	}
	@Override
	public String toString() {
		return "projectBean [project_id=" + project_id + "]";
	}
	
}

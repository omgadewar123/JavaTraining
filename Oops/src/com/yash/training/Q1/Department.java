package com.yash.training.Q1;

public class Department {

	private String deptId;
	
	private String dname;

	public Department(String deptId, String dname) {
		super();
		this.deptId = deptId;
		this.dname = dname;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + "]";
	}
	
	
	
}

package com.yash.training.Q1;

import java.util.Date;

public class Employee extends Person {
	
	private double salary;
	private Date date_of_joining;
	private String base_location;
	private Department deptObj;
	private int contactNo;
	private String emailId;
	
	
	
	
	public Employee(int pid, String pname, String paddress, Date dob, double salary, Date date_of_joining,
			String base_location, Department deptObj, int contactNo, String emailId) {
		super(pid, pname, paddress, dob);
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptObj = deptObj;
		this.contactNo = contactNo;
		this.emailId = emailId;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getBase_location() {
		return base_location;
	}
	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}
	public Department getDeptObj() {
		return deptObj;
	}
	public void setDeptObj(Department deptObj) {
		this.deptObj = deptObj;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	void printEmployeeDetails() {
		System.out.println("Employee ID : "+pid+"\nEmployee Name: "+pname+"\nAddress: "+paddress+"\nDOB: "+dob+
				"\nSalary: "+salary+"\nDate of Joining: "+date_of_joining+"\nBase Location: "+base_location+
				"\nDepartment: "+deptObj+"\nContact Number: "+contactNo+"\nEmail-Id: "+emailId);
	}
	
	
	
	
}

package com.practice.streamsapi;

import java.util.List;

public class Employee {

	private String firstname;
	private String lastname;
	private Double salary;
	private List<String> project;

	public Employee() {

		super();
	}

	public Employee(String firstname, String lastname, Double salary, List<String> project) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.project = project;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<String> getProject() {
		return project;
	}

	public void setProject(List<String> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary + ", project="
				+ project + "]";
	}

}

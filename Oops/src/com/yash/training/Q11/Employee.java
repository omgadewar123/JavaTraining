package com.yash.training.Q11;

import java.util.Date;

public class Employee {
	
	int id;
	String name;
	String address;
	int salary;
	String dob;
	String doj;
	
	public Employee(int id, String name, String address, int salary, String string, String string2) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.dob = string;
		this.doj = string2;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", dob=" + dob
				+ ", doj=" + doj + "]";
	}
	
	
	
	

}

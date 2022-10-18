package com.practice;
// comparable using 
public class Student implements Comparable<Student>{
	private String name;
	
	private String phone;
	
	private int id;

	public Student(String name, String phone, int id) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
	
	

}

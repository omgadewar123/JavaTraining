package com.practice;

public class YashEmployee {

	private String name;
	
	private String mobile;
	
	private int id ;

	public YashEmployee(String name, String mobile, int id) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.id = id;
	}

	@Override
	public String toString() {
		return "YashEmployee [name=" + name + ", mobile=" + mobile + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}

package com.yash.training.Q1;

import java.util.Date;

public class Customer extends Person {

	private Date date_of_registration;
	private String delivery_address;
	private int contactNo;
	private String email_id;
	
	
	
public Customer(int pid, String pname, String paddress, Date dob, Date date_of_registration,
			String delivery_address, int contactNo, String email_id) {
		super(pid, pname, paddress, dob);
		this.date_of_registration = date_of_registration;
		this.delivery_address = delivery_address;
		this.contactNo = contactNo;
		this.email_id = email_id;
	}

	public Date getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(Date date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	void printCustomerDetails() {
		System.out.println("Customer Id: " + pid + "\nCustomer Name: " + pname + "\nAddress: " + paddress + "\nDOB: "
				+ dob + "\nRegistration Date: " + date_of_registration + "\nDelivery Address" + delivery_address
				+ "\nContactNo: " + contactNo + "\nEmail-Id: " + email_id);
	}
	
	
}

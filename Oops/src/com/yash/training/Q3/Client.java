package com.yash.training.Q3;

public class Client {
	
	public static void main(String[] args) {
		
		
		Branch bb = new Branch(1, "Pune", "Pune");

		Customer cc = new Customer(1, 333, "om", "Pune", "07/04/1990", "05/04/1997", bb);

		CustomerAccountStatement cas1 = new CustomerAccountStatement(1, cc, 10, 10, "07/04/1990");

		CustomerAccountStatement cas2 = new CustomerAccountStatement(2, cc, 10, 10, "07/04/1990");

		CustomerAccountStatement cas3 = new CustomerAccountStatement(3, cc, 10, 10, "07/04/1990");

		Customer cc2 = new Customer(2, 333, "om", "Pune", "07/04/1990", "07/04/1990", bb);

		CustomerAccountStatement cas12 = new CustomerAccountStatement(12, cc2, 10, 10, "07/04/1990");

		CustomerAccountStatement cas22 = new CustomerAccountStatement(22, cc2, 10, 10, "07/04/1990");

		CustomerAccountStatement cas32 = new CustomerAccountStatement(32, cc2, 10, 10, "07/04/1990");

		System.out.println(cas12);

	}
}

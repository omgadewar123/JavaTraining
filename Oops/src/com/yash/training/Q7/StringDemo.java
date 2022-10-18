package com.yash.training.Q7;

import java.util.Scanner;

public class StringDemo extends StringComparision{
	
	
	@Override
	public void stringcompare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name =sc.nextLine();
		
		System.out.println("Enter another name or same name ");
		String newname = sc.nextLine();
		
		if(name.equals(newname)) {
			System.out.println("both name same ");
		}else {
			System.out.println("both name are different ");
		}
		
		
		
		
		
		
		
	}

}

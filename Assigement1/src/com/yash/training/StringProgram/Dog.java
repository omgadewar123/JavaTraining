package com.yash.training.StringProgram;

public class Dog {
	//WAP to demonstrate how garbage collector work when any memory is not referenced by string 
	//object
	public String name;

	public Dog(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}

	


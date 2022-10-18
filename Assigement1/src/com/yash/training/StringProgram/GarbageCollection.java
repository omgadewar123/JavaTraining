package com.yash.training.StringProgram;
public class GarbageCollection {
	//WAP to demonstrate how garbage collector work when any memory is not referenced by string 
	//object
	public static void main(String[] args) {
		
		Dog d4;
		
		Dog d1 = new Dog("raja");
		
		Dog d2 = new Dog("dogii");

		Dog d3 = new Dog("sheru");
		
		d4= new Dog("Tippy");
		
		d2= new Dog("max");
		
		System.out.println(d2);
		

	}

}

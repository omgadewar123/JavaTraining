package com.yash.training.classroom;

public class ArrayObject {
	public static void main(String[] args) {
		
	
	Student st = new Student ("rupali", 101);
	Student st1 = new Student ("om", 102);
	Student st2 = new Student ("akshay", 103);
	
	Student[] std = new Student[3];
	std[0]=st;
	std[1]=st1;
	std[2]=st2;
	
	for(Student k :std) {
		System.out.println(k);
	}
	
	

}
}
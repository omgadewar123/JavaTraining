package com.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortExample {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student("rupali","1233",12));
		al.add(new Student("om","17",15));
		al.add(new Student("ashwini","12343",10));
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
		
	}

}

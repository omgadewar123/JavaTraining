package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashCodeDemo {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		
		Employee e2 = new Employee(1);
		
		Map<Employee,String> m = new HashMap<>();
		
		m.put(e2, "rupali");
		m.put(e2, "roops");
		
		System.out.println(m.size());
		
		System.out.println(m.entrySet());
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		Map<Integer,String> m1 = new HashMap<>();
		m1.put(i, "one");
		m1.put(i1, "one");
		
		System.out.println(m1.size());
		
		
	}
	

}

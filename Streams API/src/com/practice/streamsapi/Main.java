package com.practice.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	
	static List<Employee> l = new ArrayList<>();
	
	static {
		
		l.add(new Employee("om","gadewar",5000.0,List.of("Project1","Project2")));
		l.add(new Employee("nilesh","pusdekr",4000.0,List.of("Project2","project4")));
		l.add(new Employee("shital","pagare",4500.0,List.of("Project8","Project2")));
		l.add(new Employee("smita","adhav",6000.0,List.of("Project2","project9")));
	
	}
	
	
	
	public static void main(String[] args) {
		// using for each
	//	l.stream().forEach(l-> System.out.println(l));
		
		// using map 10% increase salary
		
		List<Employee> incrasesalary =l.stream().map(l->new Employee(
				l.getFirstname(),
				l.getLastname(),
				l.getSalary()*1.10,
				l.getProject())).collect(Collectors.toList());
		
		System.out.println(incrasesalary);
		
		
	}

}

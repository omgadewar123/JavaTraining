package com.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//1) WAP to sort Collection elements in ascending order.

public class Q1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("om");
		al.add("priya");
		al.add("ashwini lohar");
		al.add("nilesh");
		
		Collections.sort(al);
		
		System.out.println(al);
		
		//Collections.sort(al,Collections.reverseOrder());
		
	
		// System.out.println(al);
		
		
	}

}

package com.yash.collection;

import java.util.Collections;
import java.util.Vector;

// WAP to store data related to item in Vector
// and after that sort the data
public class Q5 {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);
		v.add(15);
		v.add(2);
		v.add(6);
		v.add(4);
		
		System.out.println("Vector element :"+v);
		
		Collections.sort(v);
		
		System.out.println("After sorting Vector element :"+v);
		
		
		
		
	}

}

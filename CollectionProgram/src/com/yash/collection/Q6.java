package com.yash.collection;

import java.util.HashMap;
import java.util.TreeMap;

//WAP to store data in hashmap. Keys are the city name and values are the population. 
//Now you have to sort the all elements (on the basis of city name ) in hashmap and 
//print the detail
public class Q6 {

	public static void main(String[] args) {
		
		HashMap<String ,Integer> hm = new HashMap<>();
		
		hm.put("pune", 10000);
		hm.put("mumbai", 5000);
		hm.put("nanded",2000);
		hm.put("Kolapur", 3000);
		
		
		System.out.println("HashMap before sorting :"+hm);
		
		// using TreeMap sorting 
		
		TreeMap<String, Integer> sort = new TreeMap<>();
		
		sort.putAll(hm);
		
		System.out.println("After sorting hashMap:"+sort);
		
		
		
		
	}
}

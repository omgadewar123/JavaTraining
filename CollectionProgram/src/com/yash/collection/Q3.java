package com.yash.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

//3) WAP to store elements in List and remove all duplicates value from it. (Numbers 
//should be inserted). When duplicates are removed print all elements in ascending 
//order
public class Q3 {

	

	static Logger logger = Logger.getLogger(Q3.class.getName());

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

		ArrayList<T> newList = new ArrayList<T>();
		for (T element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		System.out.println("ArrayList with duplicates: " + list);
		ArrayList<Integer> newList = removeDuplicates(list);
		System.out.println("ArrayList with duplicates removed: " + newList);

		Collections.sort(newList);
		System.out.println(newList);

	}
}

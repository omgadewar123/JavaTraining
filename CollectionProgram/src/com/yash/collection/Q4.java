package com.yash.collection;
//WAP to store elements in List and remove all duplicates names of items. After 
//duplicates are removed print all elements in descending order. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//
public class Q4 {
	// Function to remove duplicates from an ArrayList
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

		// Create a new ArrayList
		ArrayList<T> newList = new ArrayList<T>();

		for (T element : list) {

			// If this element is not present in newList
			// then add it
			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

		// return the new list
		return newList;
	}

	
	public static void main(String args[]) {

		// Get the ArrayList with duplicate values
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

		
		System.out.println("ArrayList with duplicates: " + list);

		// Remove duplicates
		ArrayList<Integer> newList = removeDuplicates(list);

		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed: " + newList);
		
		Collections.sort(newList,Collections.reverseOrder());
		
		System.out.println("After remove duplicate desending order "+newList);
	}

}

package com.yash.java8.ques2;

import java.util.Arrays;

public class SequanceChar {

	public static void main(String[] args) {

		String given[] = { "Taj is situated in Agra" };
		String find = "ast";
		boolean anyMatch = Arrays.stream(given).anyMatch(s -> s.contains(find));
		System.out.println(anyMatch);
		if (anyMatch == true) {
		System.out.println(find + " String found");
		}
		System.out.println(find + " String not found");


		
	}

}

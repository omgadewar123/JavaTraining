package com.yash.java8.ques1;

import java.util.Scanner;
import java.util.stream.IntStream;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CheckPlindromeque1 {
static Logger logger = Logger.getLogger(CheckPlindromeque1.class.getName());
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
            StringBuilder bl=new StringBuilder();
		 String word;
		 logger.info("enter word to check given word is palindrome or not=");
		  Scanner sc=new Scanner(System.in);
		 word=sc.next();
		 /*     * for(int i=word.length()-1;i>=0;i--)
		  { bl.append(word.charAt(i));   
		    *      * } String reverse=bl.toString(); 
		  if(word.equalsIgnoreCase(reverse)) { 
		      * System.out.println("palindrome"); 
		  }else { System.out.println("not"); }     */

		 	boolean isPallindrome = IntStream.range(0, word.length() / 2)
		 	.allMatch(i -> word.charAt(i) == word.charAt(word.length() - i - 1));
		 	if (isPallindrome) {
		 		logger.info("Palindrome");
		 	} 
		 	else
		 	{
		 		logger.info("Not Palindrome");
		 	}
	
	
	}

}

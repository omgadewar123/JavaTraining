package com.yash.training.classroom;

import java.util.logging.Logger;

public class StringExampleUsingLogger {
	
	 static Logger logger = Logger.getLogger(StringExampleUsingLogger.class.getName());
	    public static void main(String[] args) {



	       String str1 = "Yash ";
	        logger.info("where is "+str1+" hashcode "+str1.hashCode());
	        
	        //System.out.println("where is "+str1+" hashcode "+str1.hashCode());
	        String str2 = "Yash Magarpatta";
	        System.out.println("where is "+str2+" hashcode "+str2.hashCode());
	        String str3 = new String("Yash");
	        System.out.println("where is "+str3+" hashcode "+str3.hashCode());
	        String name="";
	        System.out.println("where is "+name+" hashcode "+name.hashCode());
	        
	        
	}


}

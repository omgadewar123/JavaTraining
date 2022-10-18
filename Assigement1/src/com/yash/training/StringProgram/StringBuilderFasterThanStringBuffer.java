package com.yash.training.StringProgram;

public class StringBuilderFasterThanStringBuffer {
	
	//5) WAP to demonstrate which is fast in processing
	//StringBuilder or StringBuffer


	public static void main(String[] args) {
		StringBuilderFasterThanStringBuffer ob = new StringBuilderFasterThanStringBuffer();
		ob.StringBuilderDemo();
		ob.StringBufferDemo();
	}
	public void StringBuilderDemo() {
		long startTime =System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		
		for(long i=1;i<10000000;i++) {
			sb.append(i);
			sb.append("");
			sb.append(i);
			sb.append("");
			sb.append(i);
			sb.append(i);
			sb.append("");
			sb.append(i);
			sb.append("");
			sb.append(i);
					
		}
		System.out.println("time taken by StringBuilder :"+(System.currentTimeMillis()-startTime));
	}
	public void StringBufferDemo() {
		long startTime1 =System.currentTimeMillis();
		
		StringBuffer sbf = new StringBuffer();
		for(int i=1;i<10000000;i++) {
			sbf.append(i);
			sbf.append("");
			sbf.append(i);
			sbf.append("");
			sbf.append(i);
			sbf.append(i);
			sbf.append("");
			sbf.append(i);
			sbf.append("");
			sbf.append(i);

			
		}
		System.out.println("String buffer Time taken: "+(System.currentTimeMillis()-startTime1));

	}
}

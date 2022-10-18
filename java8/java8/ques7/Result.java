package com.yash.java8.ques7;

public class Result {

	public Calculate emiCalculation() {
		 Calculate c1=(principal,rate,time,emi)->(principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
         return c1;
	}

	public double input(Calculate c,double principal,double rate, double time, double emi) {

		return c.calculate(principal, rate, time,emi);
	}

}

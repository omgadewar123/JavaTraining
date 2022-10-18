package com.yash.training.Q2;

public class Traiangle implements Shape {
	
	@Override
	public void area(Point[] p) {
		
	
		Point A=p[0];
		Point B=p[1];
		Point C=p[2];

		float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
		System.out.println(Math.abs(area));
	}

}

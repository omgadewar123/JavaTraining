package com.yash.training.Q2;

public class Circle implements  Shape {
	@Override
	public void area(Point[] points) {

		Point A = points[0];
		Point B = points[1];
		double

		r = ((A.x - B.x) * 2 + (A.y - B.y) * 2) * 0.5;
		double area = 3.14 * (r * 2);
		System.out.println(Math.abs(area));
	}

}

package com.yash.training.Q2;

public class AreaClient {
	public static void main(String[] args) {

		Shape triangle = new Traiangle();
		Point p[] = new Point[3];
		p[0] = new Point(115, 12);
		p[1] = new Point(11, 127);
		p[2] = new Point(345, 12);
		triangle.area(p);

		Shape c = new Circle();
		Point pc[] = new Point[2];
		pc[0] = new Point(11, 17);
		pc[1] = new Point(15, 21);
		c.area(pc);
		
		Shape sc=new Squre();

	}
}



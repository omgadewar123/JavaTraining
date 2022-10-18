package com.yash.training.abstraction;

public class coordinate {
	int m_x, m_y;
	  
	 
	  
	public coordinate (int x, int y) { m_x = x; m_y = y; }
	  
	public coordinate () { this(10, 10); }
	  
	public int getX() { return m_x; }
	  
	public int getY() { return m_y; }
	  
	 
	  
	public static void main(String args[]) {
	  
	          coordinate obj = new coordinate ();
	  
	          System.out.println(obj.getX());
	  
	}
}

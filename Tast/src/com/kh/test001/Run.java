package com.kh.test001;

public class Run {

	public static void main(String args[]) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		c.rad = -4.5;
		System.out.println(c.getArea());
	}

}

package com.kh.practice;

public class RectangleController {
	Rectangle r = new Rectangle();
		
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidt(width);
		
		int area = r.getHeight() * r.getWidt();  
		return "면적 : " + r.toString() + " / " + area;
	
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidt(width);
		
		int perimeter = (r.getHeight() + r.getWidt()) * 2;  
		return "둘레 : " + r.toString() + " / " + perimeter;
	}
	
}
	
package com.kh.practice;

public class Rectangle extends Point{
	private int widt;
	private int height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(int x, int y, int widt, int height) {
		super(x, y);
		this.widt = widt;
		this.height = height;
	}

	public int getWidt() {
		return widt;
	}

	public void setWidt(int widt) {
		this.widt = widt;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return widt + ", " + height;
	}
	
	
}

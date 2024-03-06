package com.kh.test;

public class Fruit {
	private String fruit;
	private String a;
	
	public Fruit() {
		super();
	}

	public Fruit(String fruit, String a) {
		super();
		this.fruit = fruit;
		this.a = a;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "맛있는 과일 = " + fruit + " 색 = " + a + "\n";
	}
	
	
}

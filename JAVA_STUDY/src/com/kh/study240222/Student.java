package com.kh.study240222;

public class Student {

	private String name;
	private String suvject;
	private int score;
	
	public Student() {
		super();
	}

	public Student(String name, String suvject, int score) {
		super();
		this.name = name;
		this.suvject = suvject;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuvject() {
		return suvject;
	}

	public void setSuvject(String suvject) {
		this.suvject = suvject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", suvject=" + suvject + ", score=" + score + "]";
	}
	
	public String inform() {
		return this.name + this.suvject + this.score;
	}
}

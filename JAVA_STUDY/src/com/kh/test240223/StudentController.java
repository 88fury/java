package com.kh.test240223;

public class StudentController {
	Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		super();
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {
		
		return null;
	}
	
	public int sumScore() {
		
		return 0;
	}
	
	public double[] avgScore() {
		
		return;
	}

}

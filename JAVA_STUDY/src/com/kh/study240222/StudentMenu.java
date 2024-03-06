package com.kh.study240222;

public class StudentMenu {
	StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] strArr = ssm.printStudent();
		for(int i = 0; i < strArr.length; i++) {
			strArr[i].inform();
		}
		
		System.out.println("========== 학생 성적 출력 ==========");
		double[] scoreArr =ssm.avgScore();
		System.out.println("학생 점수 합계 : " + scoreArr[0]);
		System.out.println("학생 점수 평균 : " + scoreArr[1]);
		
//		System.out.println("========== 성적 결과 출력 ==========");
//		for(int i = 0; i < stuArr.)
	}
	

}

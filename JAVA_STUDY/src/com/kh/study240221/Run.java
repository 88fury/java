package com.kh.study240221;

public class Run {

	public static void main(String[] args) {
//		Member m = new Member();
//		m.changeName("진영재");
//		m.printName();
		
//		Book b1 = new Book();
//		Book b2 = new Book("홍길동전", "한글출판", "허균");
//		Book b3 = new Book("홍길동전", "한글출판", "허균", 4000000, 50);
//		
//		System.out.println(b1.toString());
//		System.out.println(b2.toString());
//		System.out.println(b3.toString());
		
//		Employee e1 = new Employee();
//		Employee e2 = new Employee(100, "홍길동");
//		Employee e3 = new Employee(100, "홍길동", "영업부", "과장", 25, '남', 2500000, 0.05, "010-1234-5678", "서울시 강남구");
//		
//		System.out.println(e1.toString());
//		System.out.println(e2.toString());
//		System.out.println(e3.toString());
		
		Employee e = new Employee();
		
		e.setEmpNo(100);
		e.setEmpName("홓길동");
		e.setDept("영업부");
		e.setJob("과장");
		e.setAge(25);
		e.setGender('남');
		e.setSalary(2500000);
		e.setBonusPoint(0.05);
		e.setPhone("010-1234-5678");
		e.setAddress("서울시 강남구");
		
		
		System.out.print("[ 사원번호 : " + e.getEmpNo());
		System.out.println(", 이름 : " + e.getEmpName() + " ]\n");
		
		System.out.print("[ 사원번호 : " + e.getEmpNo());
		System.out.print(", 이름 : " + e.getEmpName());
		System.out.print(", 부서 : " + e.getDept());
		System.out.print(", 직급 : " + e.getJob());
		System.out.print(", 나이 : " + e.getAge());
		System.out.print(", 성별 : " + e.getGender());
		System.out.print(", 시급 : " + e.getSalary());
		System.out.print(", 보너스 : " + e.getBonusPoint());
		System.out.print(", 전화번호 : " + e.getPhone());
		System.out.print(", 주소 : " + e.getAddress() + " ]");
		
		
	}

}

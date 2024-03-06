package com.kh.study240221;

public class Member {
	//필드
	//자료형 필드명;
	private String memberld;
	private	String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//생성자
	// : 객체 생성시 필드에있는 변수를 초기화 해주기 위한 특수메소드
	// 내가 직접 만들지 않으면 자동으로 기본생성자가 생성된다.
	//접근제한자 클래스명(매게변수){
	// 초기화코드
	//}
	public Member() {
		super();
	}
	
	
	public Member(String memberld, String memberPwd, String memberName, int age, char gender, String phone,
			String email) {
		super();
		this.memberld = memberld;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}

	//메소드
	//접근제한자 반환형 메소드명(메게변수){
	// 실행할 코드
	//}
	public String getMemberld() {
		return memberld;
	}


	public void setMemberld(String memberld) {
		this.memberld = memberld;
	}


	public String getMemberPwd() {
		return memberPwd;
	}


	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	//실제 객체메모르릴 참조하고 있는 참조변수를 호출시 자동으로 호출되는 메소드
	//Object클래스에 이미 정의되어있는 메소드
	@Override
	public String toString() {
		return "Member [memberld=" + memberld + ", memberPwd=" + memberPwd + ", memberName=" + memberName + ", age="
				+ age + ", gender=" + gender + ", phone=" + phone + ", email=" + email + "]";
	}


	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println(this.memberName);
	}
	

}

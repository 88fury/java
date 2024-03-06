package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.MemberDao;
import com.kh.model.vo.Member;
import com.kh.service.MemberService;
import com.kh.view.MemberMenu;

public class MemberController {
	Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	// 실제 m안에 실제 몇개가 있는지 체크
	// null이 아니라는 것
	public int existMemberNum() {
		int num = 0;
		for (int i = 0; i < m.length; i++) { // 배열의 인덱스 반복
			if (m[i] != null) {
				num++;
			}
		}

		return num;
	}

	// 결과는 true 또느 false -> 아이디가 중복(true) : 아이디중복x(false)
	// inputld가 배열m에 담겨있는지?
	// 배열m안에있는 객체중에 inputld랑 같은것이 있는지 검사
	public Boolean checkld(String inputld) {
		Boolean checkld = false;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				return checkld;
			}

			if (m[i].getId().equals(inputld)) {
				checkld = true;
			}
		}

		return checkld;
	}

	// 전달된 값들을 가지고 객체생성
	// m에 객체를 넣어준다.
	// 배열을 반복하면서 null을 찾아서 가장 처음 발견한 null값에 객체를 넣어준다.
	public void insertMember(String id, String name, String password, String email, char gender, int age) {

		Member m = new Member(id, name, password, email, gender, age);
		int result = new MemberService().insertMember(m);

		if (result > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원이 추가되었습니다.");
		} else {
			new MemberMenu().displayFail("회원추가를 실패하였습니다.");
		}

	}
	public void selectList() {
		ArrayList<Member> list = new MemberService().selectList();
		
		
		if(list.isEmpty()) {
			new MemberMenu().displayNoData("전체 조회 결과가 없습니다.");
		} else { 
			new MemberMenu().displayMemberList(list);
		}
	}
	
	
	// id로 회원을 조회하는 메소드
	// id -> id가 똑같은 멤버 찾기
	public void searchld(String id) {
		Member m = new MemberService().selectSearchld(id);
		System.out.println(m);
		
			if (m == null) {
				new MemberMenu().displayNoData("검색 결과가 없습니다.");
			} else {
				new MemberMenu().displayMember(m);;
			}
		
	}

	// 이름으로 회원을 조회하는 메소드
	public void searchName(String name) {
		Member m = new MemberService().selectSearchld(name);
		System.out.println(m);
		
			if (m == null) {
				new MemberMenu().displayNoData("검색 결과가 없습니다.");
			} else {
				new MemberMenu().displayMember(m);;
			}
		
	}

	public void searchEmail(String email) {
		Member m = new MemberService().selectSearchld(email);
		System.out.println(m);
		
			if (m == null) {
				new MemberMenu().displayNoData("검색 결과가 없습니다.");
			} else {
				new MemberMenu().displayMember(m);;
			}
		
	}
	

	public Boolean updatePassword(String id, String password) {
		Member[] mem = new Member[1];

		return null;
	}

	public Boolean updateName(String id, String name) {

		return null;
	}

	public Boolean updateEmail(String id, String email) {
		return null;
	}

	public Boolean delete(String id) {
		return null;
	}

	public void delete() {

	}


}

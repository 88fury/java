package com.kh.test3;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public void MemberMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");
			if (mc.existMemberNum() == 10)
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");

			if (mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
			}

			System.out.println("2. 회원 검색");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				if (mc.existMemberNum() != 10) {
					this.insertMember();
				}
				break;
			case 2:
				this.searchMember();
				break;
			case 3:
				this.updateMember();
				break;
			case 4:
				this.deletMember();
				break;
			case 5:
				this.printAll();
				break;
			case 9:
				System.out.println("프로그램 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			}
		}
	}

	public void insertMember() {

		String id;
		String name;
		String password;
		String email;
		char gender;
		int age;

		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
		System.out.println("새 회원을 등록합니다.");

		while (true) {
			System.out.print("아이디 : ");
			id = sc.next();
			if (mc.existMemberNum() != 0) { // 아이디 갯수 체크
				Boolean chkid = mc.checkld(id);
				if (chkid == true) { // 중복 아이디가 있다
					System.out.println("중복된 아이디 입니다. 다시입력해 주세요");
				} else { // 중복 아이디가 없다.
					break;
				}
			} else {
				break;
			}
		}

		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("비밀번호 : ");
		password = sc.next();
		System.out.print("이메일 : ");
		email = sc.next();

		while (true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().toLowerCase().charAt(0);

			if (gender == 'm' || gender == 'f') {
				break;
			}
			System.out.println("잘못입력하셨습니다. 다시입력하세요.");
		}

		System.out.print("나이 : ");
		age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);

		// 사용자에게 직접 입력 받되 아이디의 경우 기존 회원의 아이디와
		// 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함
		// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고
		// 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후
		// 다시 아이디를 받도록 함
		// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를
		// 출력 후 다시 성별을 입력하도록 함
		// 아이디부터 나이까지 모든 데이터를 받았으면
		// mc의 insertMember메소드의 매개변수로 넘김

	}

	public void searchMember() {

		while (true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int num1 = sc.nextInt();

			switch (num1) {
			case 1:
				this.searchld();
				break;
			case 2:
				this.searchName();
				break;
			case 3:
				this.searchEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘롯 입력하셨습니다. 다시입력하세요.");
				
			}

		}
	}

	public void searchld() {
		String id;
		System.out.print("검색할 아이디를 입력하세요 : ");
		id = sc.next();

		String searchID = mc.searchld(id);
		if (searchID == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(searchID);
		}
	}

	public void searchName() {
		String name;
		System.out.print("검색할 이름을 입력하세요 : ");
		name = sc.next();

		String searchID = mc.searchld(null);
		if (mc.searchName(searchID) == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(searchID);
		}
	}

	public void searchEmail() {
		String email;
		System.out.print("검색할 이름을 입력하세요 : ");
		email = sc.next();

		String searchID = mc.searchld(email);
		if (searchID == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(searchID);
		}
	}

	public void updateMember() {
		while (true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이름 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				this.updatePassword();
				break;
			case 2:
				this.updateName();
				break;
			case 3:
				this.updateEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}

	public void updatePassword() {
		while(true){
			System.out.print("수정할 회원의 아이디 : ");
			String id = sc.nextLine();
			System.out.print("수정할 비밀번호 : ");
			String password = sc.nextLine();
			
		
			if(mc.updatePassword(id, password)) {
				System.out.println("수정이 성공적으로 되었습니다. ");
				return;
			}
		}
	}

	public void updateName() {

	}

	public void updateEmail() {

	}

	public void deletMember() {

	}

	public void deleteOne() {

	}

	public void deleteAll() {

	}

	public void printAll() {

	}

}

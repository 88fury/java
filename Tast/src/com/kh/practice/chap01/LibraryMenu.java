package com.kh.practice.chap01;

import java.util.Scanner;

public class LibraryMenu {
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	 
	public void mainMenu() {
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("3. 도서 전체 조회");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				lc.mylnfo();
				break;
			case 2:
				lc.selectAll();
				break;
			case 3:
				lc.searchBook(null);
				break;
			case 4:
				lc.renBook(menuNum);
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력 하였습니다 다시입력해주세요.");
			}
			
		}
	}
	public void selectAll() {
		
	}
	public void searchBook() {
		
	}
	public void rentBook() {
		
	}
}

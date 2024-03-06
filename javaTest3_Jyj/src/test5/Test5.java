package test5;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 + num2 == 1 && num1 + num2 < 10 ) {
			if (num1 * num2 < 10) {
					System.out.println("한자리 수 입니다.");
				} else {
					System.out.println("두자리 수 입니다.");
				}
			
		}
			
		
		}
		
	

}

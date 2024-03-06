package test4;

import java.util.Scanner;

public class Tast4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 < 10 && num2 <10) {
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 x num2 = " + (num1 * num2));
		
		}
		
			
		
		
	}

}

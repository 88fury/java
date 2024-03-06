package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		for (int i = 2; i <= 5; i++) {
			if(i % 2 == 1) {
				for (int j = 1; j <=9; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
			}
			
			}
		}
		
	}

}

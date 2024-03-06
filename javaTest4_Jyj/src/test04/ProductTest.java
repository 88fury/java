package test04;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명 : ");
		String prName = sc.nextLine();
		
		System.out.print("가격 : ");
		int prPrice = sc.nextInt();
		
		System.out.print("수량 : ");
		int prQuantity = sc.nextInt();
		
		Product pr = new Product(prName, prPrice, prQuantity);
		
		pr.information(prPrice, prName, prQuantity, prQuantity);
	}

}

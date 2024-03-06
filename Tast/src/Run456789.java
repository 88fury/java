import java.util.Scanner;

public class Run456789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
		
	}

}

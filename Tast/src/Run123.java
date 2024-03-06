import java.util.Scanner;

public class Run123 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ranking;
		char medalColor;
		System.out.println("등 수를 입력하세요 : ");
		ranking = sc.nextInt();
		
		switch(ranking) {
		case 1: medalColor = 'G';
			break;
		case 2: medalColor = 'S';
			break;
		case 3: medalColor = 'B';
			break;
		default:
				medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
	}
}

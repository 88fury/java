import java.util.Scanner;

public class Run02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.print("점수를 입력하세요. : ");
		score = sc.nextInt();
		
		if (score <= 100 && score >= 90) {
			grade = 'A';
				
		} else if (score >= 80) {
			grade = 'B';
			
		} else if (score >= 70) {
			grade = 'C';
			
		} else if (score >= 60) {
			grade = 'D';
		
		} else {
			grade = 'F';
		
		}
		System.out.println("학점은 " + grade + " 입니다.");
		
		if (score > 100 || score < 0) {
			System.out.println("다시 입력하세요");
		}
	}

}

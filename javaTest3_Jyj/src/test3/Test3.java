package test3;

public class Test3 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		
		while(num <= 100) {
			sum +=num;
			num++;
			
		}
		double num1 = (double) sum / 100;
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + num1);
		
	}

}

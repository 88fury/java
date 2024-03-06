package test06;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			System.out.println("main 함수 내에서 모든 코드 작업 진행 중...");
			
			Calculator calculator = new Calculator();
			
			double result = calculator.getSum(6);
	        System.out.println("1부터 6까지의 합: " + result);
			
	        result = calculator.getSum(10);
            System.out.println("1부터 10까지의 합: " + result);  // 이 부분은 실행되지 않음
        } catch (InvalidException e) {
        	System.out.println("예외 발생: " + e.getMessage());
		}
	}		
}

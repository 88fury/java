package test06;

public class Calculator {
	public double getSum(int n) throws InvalidException{
		if (n < 2 || n > 5) {
			throw new InvalidException("data는 2부터 5까지의 범위여야 합니다.");
		}
		
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	

}

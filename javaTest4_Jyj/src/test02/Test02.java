package test02;

public class Test02 {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double[] data = new double[5]; 
		double sum = 0;
		
		String[] st;
		st = str.split(",");
		
		int index = 0;
		for (String s : st) {
			data[index] = Double.parseDouble(s);
			sum += data[index];
			index++;
		}
		
		System.out.printf("합계:%.3f%n", sum);
		System.out.printf("평균:%.3f", sum / data.length);
	}

}

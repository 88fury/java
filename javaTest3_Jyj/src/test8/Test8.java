package test8;



public class Test8 {

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
		

		
		double sum = 0;
		for(int i = 0; i < array.length; i++) { //큰덩이
			//System.out.println(array[0]);
			for(int j = 0; j < array[i].length; j++) { //작은덩이
//				System.out.println(array[i][j]);
				sum = sum + array[i][j];
			}

		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / 16);

	}

}

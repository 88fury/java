package test10;

public class Test10 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		
		int a = array[0][0];
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; i++) {
				a = array[i][j];
				System.out.println(a);
		
			}
		}
	}

}

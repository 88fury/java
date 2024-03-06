package test7;

public class Test7 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		arr[5] = 6;
//		arr[6] = 7;
//		arr[7] = 8;
//		arr[8] = 9;
//		arr[9] = 10;
		
		for(int i = 1; i <= 10; i++) {
			arr[i-1] = i;
		}
		
		double sum = 0;
		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 1) { //홀수 판별
				sum = sum + i;
				System.out.println(arr[i-1]);
			} else {
				continue;
			}
				
		}
		
		System.out.println(sum);
		
	}

}

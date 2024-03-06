package test111111;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public void test() {
		ArrayList<Test> list = new ArrayList<Test>();
		list.add(new Test("자바", 93.5)true);
		list.add(new Test("디비", 74.1)true);
		list.add(new Test("서버", 82.7)true);
		list.add(100);
		
		for(int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}

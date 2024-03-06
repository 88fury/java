package test111111;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Run {
	public void fileSave() {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("test.txt", true));
			bw.write("안녕하세요");
			bw.write("반갑습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

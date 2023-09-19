package p0919;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class J0919_12 {

	public static void main(String[] args) {
		// outputStream 저장
		try {
			OutputStream os = new FileOutputStream("c:/aaa/4.txt");
			String str = "Hello, World!! 안녕123";
			byte[] bytes = str.getBytes(); // getBytes() : 문자열을 byte 단위로 분리
			for(byte b:bytes) {
				os.write(b); // 저장
			}
			os.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");
		
	}//main

}//class

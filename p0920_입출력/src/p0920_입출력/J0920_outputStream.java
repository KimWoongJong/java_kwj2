package p0920_입출력;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0920_outputStream {

	public static void main(String[] args) {
		
		// 파일에 글을 저장할 때 사용
		
		try {
			FileOutputStream fos = new FileOutputStream("c:/aaa/22.txt");
			String str = "1,홍길동,100,100,100,300,100.0,1\r\n";
			str += "2,유관순,100,100,100,300,100.0,1\r\n";
			//byte단위로 분리를 해야 글이 저장됨
			byte[] bytes = str.getBytes();
			for(byte b : bytes) {
				fos.write(b);
			}
		
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일을 저장합니다.");
		
	}

}

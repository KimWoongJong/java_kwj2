package p0920_입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class J0920_inputStream {

	public static void main(String[] args) {

		
		// byte 배열단위로 가져옴
		byte[] b = new byte[1024];
		try {
			FileInputStream fis = new FileInputStream("c:/aaa/11.txt");
			fis.read(b);
				System.out.println(new String(b));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		// 1byte단위 가져옴
//		File f = new File("c:/aaa/11.txt");
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			int read = 0;
//			while((read=fis.read()) != -1) { // 읽은 파일이 있으면
//				System.out.print((char)read); // 2byte -> 한글지원이 안됨
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}

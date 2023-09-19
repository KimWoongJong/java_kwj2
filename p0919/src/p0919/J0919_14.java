package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J0919_14 {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/bbb");
		if(!f.exists()) {
			f.mkdir();
		}
		FileInputStream fis = new FileInputStream("c:/aaa/ko1.jpg"); //파일읽기
		FileOutputStream fos = new FileOutputStream("c:/bbb/ko1.jpg"); //파일저장
		
		while(true) {
			int read = fis.read();  // 파일을 byte 단위로 읽어오기
			if(read==-1) break; 	// 파일이 더 이상 읽을게 없으면 멈춤
			fos.write(read);		// 파일을 byte 단위로 저장
		}
		
		fis.close(); // 끝
		fos.close(); // 끝
		
		System.out.println("파일이 복사 되었습니다.");
		
	}

}

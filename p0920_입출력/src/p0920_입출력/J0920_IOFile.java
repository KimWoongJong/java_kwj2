package p0920_입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0920_IOFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("c:/ccc");
		if(!f.exists()) f.mkdir();
		
		try {
			FileInputStream fis = new FileInputStream("c:/aaa/ko1.jpg");
			FileOutputStream fos = new FileOutputStream("c:/ccc/ko2.jpg");
			
			while(true) {
				int read = fis.read(); // byte단위로 파일을 읽어옴
				if(read==-1) break;
				fos.write(read); // 파일 저장
			}
		
			fis.close();
			fos.close();
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("파일을 읽어와서 파일을 저장했습니다.");
		
		

	}

}

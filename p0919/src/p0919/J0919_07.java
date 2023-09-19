package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_07 {
	
	// 1. main 메소드
	public static void main(String[] args) {
		String aName = "c:/aaa/1.txt";
		File f = createFile(aName); // createFile메소드 호출
	}//main

	static File createFile(String fileName) {
		if(fileName==null || fileName=="") {
			fileName = "c:/aaa/제목없음.txt";
		}//if
		
		File f = new File(fileName);
		try {
			f.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(fileName+"파일 생성이 되었습니다.");
		return f;
		
		
	}//createFile
	
}//class
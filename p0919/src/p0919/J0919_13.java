package p0919;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class J0919_13 {

	public static void main(String[] args) {
		String str="";
		for(int i=0;i<10;i++) {
			str += (i+1)+"번째 글을 입력합니다. 안녕하세요.\r\n";
		}
		
		try {
			FileWriter fw = new FileWriter("c:/aaa/5.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");
	}//main

}//class

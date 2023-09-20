package p0920_입출력;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class J0920_writer {

	public static void main(String[] args) {
		
		// 글을 저장할 때 사용
		String str = "3,이순신,100,100,100,300,100.0,1\r\n";
		str += "4,강감찬,100,100,100,300,100.0,1\r\n";
		str += "5,김구,100,100,100,300,100.0,1\r\n";
		
		try {
			FileWriter fw = new FileWriter("c:/aaa/22.txt",true); // false : 덮어쓰기, true : 이어쓰기 기능
			BufferedWriter bw = new BufferedWriter(fw); // 한번에 저장
			bw.write(str);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("글을 저장했습니다.");
		
	}

}

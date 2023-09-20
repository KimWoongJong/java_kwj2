package p0920_입출력;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class J0920_reader {

	public static void main(String[] args) {
		
		// 문서를 읽어올 때 사용 - 글자단위로 읽어오기에 변환이 필요없음.
		try {
			FileReader fr = new FileReader("c:/aaa/22.txt");
			BufferedReader br = new BufferedReader(fr); // 1줄씩 가져오기
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			fr.close();
			br.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("문서를 읽어왔습니다.");
	}

}

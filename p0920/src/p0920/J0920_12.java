package p0920;

import java.util.Scanner;

public class J0920_12 {

	public static void main(String[] args) {
		// 16가1023456 -> 가 앞과 뒤를 랜덤숫자로 저장해서
		// 입력한 값과 비교해서 맞는 개수를 출력하시오.
		// 26나2320411
		// --------------------
		// 맞는 개수 : 3개
		
		Scanner scan = new Scanner(System.in);
	
		while(true) {
			
			//16 0-99
			int random1 = (int)(Math.random()*100);
			String rno1 = String.format("%02d", random1);
			//System.out.println(rno1);
			rno1 += "가";
			//System.out.println(rno1);
			
			//0-9999999, 1000000
			int random2 = (int)(Math.random()*10000000);
			String rno2 = String.format("%07d", random2);
			//System.out.println(rno2);
			String randomNo = rno1+rno2;
			System.out.println("랜덤번호 : "+randomNo);
			
			
			//번호 입력
			System.out.println("------------------------");
			System.out.println("---- 대박! 랜덤 복권 -------");
			System.out.println("------------------------");
			System.out.println("복권번호를 입력하세요.>>");
			System.out.println("------------------------");
			String input = scan.next();
			if(input.length() != 10) {
				System.out.println("잘못 입력되었습니다! 다시 입력하세요.>>");
				continue; // 1회 다시시작(reset)
			}
			System.out.println("입력번호 : "+input);
			System.out.println("랜덤번호 : "+randomNo);
			
			
			// 비교
			// 맞는 개수 : 3개
			// 입력번호 1개 추출, 랜덤번호 1개 추출
			
			int count=0;
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i) == randomNo.charAt(i)) {
					count++;
				}
			}
			System.out.println("일치하는 개수 : "+count);
			
		}//while

		
		
		// 내가 한 것 int+String+int <-- String으로 한 번에 받는 것 가능.. but, 세번째가 글자니까... 그렇게 했다.
//		System.out.println("2자리 숫자를 입력하세요.");
//		int no1 = scan.nextInt();
//		System.out.println("한 글자를 입력하세요.");
//		String ltr = scan.next();
//		System.out.println("7자리 숫자를 입력하세요.");
//		int no2 = scan.nextInt();
//		String inputNo = no1+ltr+no2;
//		System.out.println("입력번호 : "+inputNo);
		
		
		
		
		
		
//		String[] no1 = new String[10];
//		for(int i=0;i<rno2.length();i++) {
//			no1[i]=rno2.charAt(i);
//		}
		
		
	}//main

}//class

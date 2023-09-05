package p0901;

import java.util.Scanner;

public class JA0901_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력하세요.");
		int number = scan.nextInt(); // enter키 값은 입력을 받지 않음.
		scan.nextLine();		
		System.out.println("이름을 입력하세요.");
		//String name = scan.next();	// 문장만 입력가능, 사이 띄우기 안됨.
		String name = scan.nextLine();  // enter키 입력까지 입력받음.
		System.out.println("이름 : "+name);
		
		System.out.println("국어 점수를 입력하세요.");
		String k = scan.nextLine(); 	// nextLine -> 문자열을 입력받는 명령어
		int kor = Integer.parseInt(k);  // String을 int타입으로 변경, String -> int 8가지 기본형 타입이면 형변환
		System.out.println("영어 점수를 입력하세요.");
		String e = scan.nextLine();
		int eng = Integer.parseInt(e);
		System.out.println("합계 : "+(kor+eng));
		
	}

}

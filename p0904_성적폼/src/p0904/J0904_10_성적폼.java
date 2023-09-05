package p0904;

import java.util.Scanner;

public class J0904_10_성적폼 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수처리");
		System.out.println("7. 순차정렬");
		System.out.println("8. 역순정렬");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();

		switch(choice) {
		case 1:
			System.out.println("성적입력을 선택하셨습니다.");
			break;
		case 2:
			System.out.println("성적출력을 선택하셨습니다.");
			break;
		case 3:
			System.out.println("성적수정을 선택하셨습니다.");
			break;
		case 4:
			System.out.println("성적삭제를 선택하셨습니다.");
			break;
		case 5:
			System.out.println("학생검색을 선택하셨습니다.");
			break;
		case 6:
			System.out.println("등수처리를 선택하셨습니다.");
			break;
		case 7:
			System.out.println("순차정렬을 선택하셨습니다.");
			break;
		case 8:
			System.out.println("역순정렬을 선택하셨습니다.");
			break;
		}//switch
		
	}//main

}//class

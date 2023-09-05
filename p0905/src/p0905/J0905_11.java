package p0905;

import java.util.Scanner;

public class J0905_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		loop1:while(true) { // 무한반복
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 종료");
			System.out.println("------------------------------");
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
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}//switch
			
		}//while
		
	}//main

}//class

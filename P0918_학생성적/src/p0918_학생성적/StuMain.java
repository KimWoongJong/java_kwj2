package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		System.out.println("--------------------------------");
		System.out.println("[ 학생성적 프로그램");
		System.out.println("--------------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 학생등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("--------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1:
				
				System.out.println();
				System.out.println("1. 학생성적입력을 선택하셨습니다.");
				System.out.println("학생의 이름을 입력하세요.");
				String name = scan.next();
				System.out.println("국어성적을 입력하세요.");
				int kor = scan.nextInt();
				System.out.println("영어성적을 입력하세요.");
				int eng = scan.nextInt();
				System.out.println("수학성적을 입력하세요.");
				int math = scan.nextInt();
	
			
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		case 5:
			break;
			
		case 6:
			break;
			
		case 0:
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}//main
	
	
	

	
	
}//class

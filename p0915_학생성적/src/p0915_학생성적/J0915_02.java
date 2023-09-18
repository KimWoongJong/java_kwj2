package p0915_학생성적;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction(); // 객체선언
		int stuCount = 1;
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		
		
		// 무한반복
		loop:while(true) {
			// 메인화면 출력부분
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			case 1: 
				// 1. 학생성적입력 메소드
				stuCount = stuAction.stuInput(stuCount);
				break;
			case 2: 
				// 2. 학생성적출력 메소드
				stuAction.stuOutput();
				break;
			case 3:
				// 3. 학생성적수정 메소드
				stuAction.stuUpdate();
				break;
			case 4:
				// 4. 학생성적삭제 메소드
				stuAction.stuDelete();
				break;
			case 5:
				// 5. 학생성적검색 메소드
				stuAction.stuSearch();
				break; //switch break
			case 6:
				// 6. 등수처리
				System.out.println();
				System.out.println("[ 학생성적 등수처리 ]");
				System.out.printf("등수처리를 진행할까요?(0.이전페이지 이동)\n");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.println("0. 이전페이지 이동");
				choice = scan.nextInt();
				switch(choice) {
				
				case 1:
					for(int i=0;i<stuAction.list.size();i++) {
						int count = 1;
						StuScore s = (StuScore)stuAction.list.get(i);
						for(int j=0;j<stuAction.list.size();j++) {
							StuScore s2 = (StuScore)stuAction.list.get(j);
							if(s.getTotal()<s2.getTotal()) {
								count++;
							}//if
						}//for
						s.setRank(count);//등수입력
					}//for i
					System.out.println("등수처리가 완료되었습니다!!");
					System.out.println();
					break;
				
				case 2:
					System.out.println("등수처리가 취소되었습니다.");
					System.out.println();
					break;
				case 0:
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break;
				}//switch
				break;//case6 break

			case 0:
				System.out.println();
				System.out.println("[ 프로그램 종료 ]");
				System.out.printf("프로그램을 종료합니다.\n");
				break loop;

			}//switch - 각메뉴
		
		}//while main출력
		
	}//main

}//class

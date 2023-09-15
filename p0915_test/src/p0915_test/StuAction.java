package p0915_test;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"}; // 성적표 상단 항목 출력을 위한 배열
	
	int mainPrint() {
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 학생등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("-------------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		return choice;
	}//mainPrint
	
	int stuInput(int stuCount) {
		while(true) {
			System.out.println();
			System.out.println("[ 학생성적입력 ]");
			System.out.printf("%d 번째 학생 이름을 입력하세요.(0. 이전페이지 이동) \n",stuCount);
			String name = scan.next(); // 변수 선언 및 입력값 저장
			if(name.equals("0")) {
				System.out.println(">> 이전 페이지로 이동합니다!!");
				System.out.println();
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			
			//StuScore s = new StuScore(name, kor, eng, math);
			list.add(new StuScore(name,kor,eng,math)); // ArrayList에 값을 저장하는 방법
			System.out.printf("%d 번째 학생성적이 저장되었습니다. \n",stuCount);
			System.out.println();
			stuCount++;
		}//while
		return stuCount;
		
	}//StuInput
	
	void stuOutput(){
		
		System.out.println();
		System.out.println("[ 학생성적출력 ]");
		System.out.println("------------------------------------------");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("------------------------------------------");
		for(int i=0;i<list.size();i++) {
			StuScore s = (StuScore)list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d/n",
					s.getStuNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}//for
		System.out.println("------------------------------------------");
		System.out.println();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}//class

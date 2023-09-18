package p0915_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {

	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList(); // 전체학생 저장
	String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	int mainPrint() {
		System.out.println("----------------------------");
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("----------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		return choice;
	}// mainPrint

	// 1. 학생입력메소드
	int stuInput(int stuCount) {
		while (true) {
			System.out.println();
			System.out.println("[ 학생성적입력 ]");
			System.out.printf("%d 번째 학생 이름을 입력하세요.(0. 이전페이지 이동)\n", stuCount);
			String name = scan.next();
			if (name.equals("0")) { // 이전 페이지 이동
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
			// 학생성적 저장
			list.add(new StuScore(name, kor, eng, math));
			System.out.printf("%d 번째 학생성적이 저장되었습니다.! \n", stuCount);
			System.out.println();
			stuCount++;
		} // while
		return stuCount;

	}// stuInput
	
	// 학생성적출력 메소드
	void stuOutput() {

		System.out.println();
		System.out.println("[ 학생성적출력 ]");
		System.out.println("--------------------------------------------------------------");
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			StuScore s = (StuScore) list.get(i);
			// "번호","이름","국어","영어","수학","합계","평균","등수"
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(),
					s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		} // for
		System.out.println("--------------------------------------------------------------");
		System.out.println();

	}// stuOutput

	// 학생성적 수정 메소드
	void stuUpdate() {
		while (true) {
			// 3. 학생성적수정 메소드
			System.out.println();
			System.out.println("[ 학생성적 수정 ]");
			System.out.printf("찾고자 하는 학생 이름을 입력하세요.(0. 이전페이지 이동)\n");
			String name = scan.next();
			if (name.equals("0")) { // 이전 페이지 이동
				System.out.println(">> 이전 페이지로 이동합니다!!");
				System.out.println();
				break;
			}

			// 홍길동
			int count = -1; // 0,1,2
			for (int i = 0; i < list.size(); i++) {
				StuScore s = (StuScore) list.get(i);
				if (name.equals(s.getName())) {
					count = i; // 찾은 방 번호
					System.out.printf("%s 학생을 찾았습니다.\n", name);
					System.out.println(" [ 수정과목 선택 ]");
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("---------------------------");
					System.out.println("원하는 번호를 선택하세요.");
					int choice = scan.nextInt();

					switch (choice) {
					case 1:
						System.out.println("[ 국어과목 수정 ]");
						System.out.println("---------------------------");
						System.out.println("현재점수 : " + s.getKor());
						System.out.println("변경할 점수를 입력하세요.");
						s.setKor(scan.nextInt()); // 입력 후 바로 국어점수에 저장
						s.setTotal(s.getKor() + s.getEng() + s.getMath()); // 점수를 읽은 후 바로 합계 저장
						s.setAvg(s.getTotal() / 3.0); // 평균 수정
						System.out.println("국어점수가 변경되었습니다.");
						System.out.println();
						break;

					case 2:
						System.out.println("[ 영어과목 수정 ]");
						System.out.println("---------------------------");
						System.out.println("현재점수 : " + s.getEng());
						System.out.println("변경할 점수를 입력하세요.");
						s.setEng(scan.nextInt()); // 입력 후 바로 국어점수에 저장
						s.setTotal(s.getKor() + s.getEng() + s.getMath()); // 점수를 읽은 후 바로 합계 저장
						s.setAvg(s.getTotal() / 3.0); // 평균 수정
						System.out.println("영어점수가 변경되었습니다.");
						System.out.println();
						break;

					case 3:
						System.out.println("[ 수학과목 수정 ]");
						System.out.println("---------------------------");
						System.out.println("현재점수 : " + s.getMath());
						System.out.println("변경할 점수를 입력하세요.");
						s.setMath(scan.nextInt()); // 입력 후 바로 국어점수에 저장
						s.setTotal(s.getKor() + s.getEng() + s.getMath()); // 점수를 읽은 후 바로 합계 저장
						s.setAvg(s.getTotal() / 3.0); // 평균 수정
						System.out.println("수학점수가 변경되었습니다.");
						System.out.println();
						break;

					}// switch
				} // if
			} // for
			if (count == -1) {
				System.out.printf("※※ 찾고자 하는 %s 학생이 없습니다. 다시 입력하세요. \n", name);
				System.out.println();
			}
			
		} // while
	}// stuUpdate

	
	// 학생성적삭제 메소드
	void stuDelete() {
		while(true) {
			System.out.println();
			System.out.println("[ 학생성적 삭제 ]");
			System.out.printf("삭제하고자 하는 학생 이름을 입력하세요.(0. 이전페이지 이동)\n");
			String name = scan.next();
			if (name.equals("0")) { // 이전 페이지 이동
				System.out.println(">> 이전 페이지로 이동합니다!!");
				System.out.println();
				break;
			}//if
			
			// 홍길동
			int count = -1; // 0,1,2
			for (int i = 0; i < list.size(); i++) {
				StuScore s = (StuScore) list.get(i);
				if (name.equals(s.getName())) {
					count = i; // 찾은 방 번호
					System.out.printf("%s 학생을 찾았습니다.\n",name);
					System.out.println(" [ 학생성적삭제 선택 ]");
					System.out.println("1. 예");
					System.out.println("2. 아니오");
					System.out.println("---------------------------");
					System.out.println("원하는 번호를 선택하세요.");
					int choice = scan.nextInt();
					
					switch (choice) {
					case 1:
						list.remove(i);
						System.out.printf("%s 학생성적이 삭제되었습니다.",name);
						System.out.println();
						break;
						
					case 2:
						System.out.printf("%s 학생성적삭제가 취소되었습니다.",name);
						System.out.println();
						break;
						
					}//switch
				}// if
			}//for
			if (count == -1) {
				System.out.printf("※※ 찾고자 하는 %s 학생이 없습니다. 다시 입력하세요. \n", name);
				System.out.println();
			}//if
		}//while
	}//stuDelete
	
	// 학생성적검색 메소드
	void stuSearch() {
		while(true) {
			System.out.println();
			System.out.println("[ 학생성적 검색 ]");
			System.out.printf("찾고자 하는 학생 이름을 입력하세요.(0. 이전페이지 이동)\n");
			String name = scan.next();
			if (name.equals("0")) { // 이전 페이지 이동
				System.out.println(">> 이전 페이지로 이동합니다!!");
				System.out.println();
				break;
			}//if
			
			// 홍길동
			int count = -1; // 0,1,2
			for (int i = 0; i < list.size(); i++) {
				StuScore s = (StuScore) list.get(i);
				if (name.equals(s.getName())) {
					count = i; // 찾은 방 번호
					System.out.printf("%s 학생을 찾았습니다.\n",name);
					System.out.println();
					System.out.printf("[ %s 학생성적출력 ]\n",name);
					System.out.println("--------------------------------------------------------------");
					for (int j=0; j < title.length; j++) {
						System.out.printf("%s\t", title[j]);
					}
					System.out.println();
					System.out.println("--------------------------------------------------------------");
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", 
							s.getStuNo(), s.getName(), s.getKor(), s.getEng(),
							s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
					System.out.println("--------------------------------------------------------------");
					System.out.println();
					break; //for break
				}// if
			}//for
			if (count == -1) {
				System.out.printf("※※ 찾고자 하는 %s 학생이 없습니다. 다시 입력하세요. \n", name);
				System.out.println();
			}//if
			
		}//while
	}
	
	
	
}// class

package p0912;

import java.util.Scanner;

public class J0912_03 {

	public static void main(String[] args) {
		// 3명의 성적을 입력받아 출력하시오. StuScore2객체를 활용
		// StuScore2
		
		Scanner scan = new Scanner(System.in);
		int stuNo = 0;
		String name = "";
		//int[] score = new int[3]; //kor,eng,math 점수를 한 번에 받을 때 사용
		int kor=0,eng=0,math=0;
		String[] subject = {"국어","영어","수학"};
		
		StuScore2[] ss = new StuScore2[3];
		
		for(int i=0;i<ss.length;i++) {
			stuNo = i+1;
			System.out.println("학생 이름을 입력하세오.");
			name = scan.next();
			System.out.println("국어성적을 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어성적을 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학성적을 입력하세요.");
			math = scan.nextInt();
			ss[i] = new StuScore2(stuNo,name,kor,eng,math);
		}//for
		
		for(int i=0;i<ss.length;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					ss[i].stuNo,ss[i].name,ss[i].kor,ss[i].eng,
					ss[i].math,ss[i].total,ss[i].avg);
		}//for
		
		
	}

}

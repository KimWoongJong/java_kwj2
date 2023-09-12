package p0912;

import java.util.Scanner;

public class J0912_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int stuNo=0;
		String name = "";
		int[] score = new int[3];
		int kor=0,eng=0,math=0;
		String[] subject = {"국어","영어","수학"}; //배열선언
		
		StuScore[] s = new StuScore[3]; //배열선언
		//s[0] = new StuScore(); //객체선언
		
		for(int i=0;i<s.length;i++) {
			stuNo = i+1;
			System.out.println("이름을 입력하세요.");
			name = scan.next();
			
			//구현 1
			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어접수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();
			s[i] = new StuScore(stuNo,name,kor,eng,math);
			
			//구현 2
//			for(int j=0;j<score.length;j++) {
//				System.out.println(subject[j]+"점수를 입력하세요.");
//				score[i] = scan.nextInt();
//			}
//			s[i] = new StuScore(stuNo,name,score[0],score[1],score[2]);
			
		}//for
		
		//화면출력
		for(int i=0;i<s.length;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s[i].stuNo,s[i].name,s[i].kor,s[i].eng,
					s[i].math,s[i].total,s[i].avg);
		}//for
			
		
		
//		StuScore s = new StuScore();
//		s.stuNo = 1;
//		s.name = "홍길동";
//		s.kor = 100;
//		s.eng = 100;
//		s.math = 99;
//		s.total = s.kor+s.eng+s.math;
//		s.avg = s.total/3.0;
//		
//		StuScore s2 = new StuScore(2,"유관순",100,99,88);
//		System.out.println("합계 : "+s2.total);
//		System.out.printf("평균 : %.2f \n",s2.avg);
		
		
	}//main

}

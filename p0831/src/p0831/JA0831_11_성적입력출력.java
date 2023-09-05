package p0831;

import java.util.Scanner;

public class JA0831_11_성적입력출력 {

	public static void main(String[] args) {
		//입력선언
		Scanner scan = new Scanner(System.in);
		//이름, 국어, 영어, 수학, 합계, 평균
		
		String name="";
		int kor=0;
		int eng=0;
		int math=0;
		
		//입력부분
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		System.out.println("국어 점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = scan.nextInt();
		
		//합계, 평균 계산
		int total = kor+eng+math;
		double avg = total/3.0;
		
		//출력부분
		System.out.printf("이름 : %s \n", name);
		System.out.printf("국어 : %d \n영어 : %d \n수학 : %d \n", kor, eng, math);
		System.out.printf("함계 : %d \n", total);
		System.out.printf("평균 : %.2f \n", avg);
	}

}

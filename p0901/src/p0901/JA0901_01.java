package p0901;

import java.util.Scanner;

public class JA0901_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = 0; 	// 정수형 타입을 생성해서 0의 값을 입력
		String name = ""; 	// 문자열 타입을 생성해서 빈 공백을 입력
		// String name = new String("");
		int kor = 0; 		// 국어 점수를 입력할 수 있는 변수 선언
		int eng = 0;
		int math = 0;
		int total = 0; 		// 합계 접수를 입력할 수 있는 변수 선언
		double avg = 0;		// 실수형 타입을 생성해서 0의 값을 입력
				
		// 키보드를 통한 값 입력
		System.out.println("학번을 입력하세요.");
		number = scan.nextInt();
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		System.out.println("국어 점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = scan.nextInt();
		
	
// 데이터값 직접입력
//		number = 1;
//		name = "홍길동";
//		kor = 100;
//		eng = 100;
//		math = 100;
		total = kor+eng+math;
		avg = total/3.0; 	// 분모에 3d 또는 (double)3으로 입력해도 됨
		
		System.out.println("[학생성적프로그램]");
		System.out.println("-----------------");		
		System.out.println("번호 : "+number);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("합계 : "+total);
		System.out.printf("평균 : %.2f \n", avg);
		//System.out.println("평균 :"+avg);

		
		int number2 = 0; 	// 정수형 타입을 생성해서 0의 값을 입력
		String name2 = ""; 	// 문자열 타입을 생성해서 빈 공백을 입력
		// String name = new String("");
		int kor2 = 0; 		// 국어 점수를 입력할 수 있는 변수 선언
		int eng2 = 0;
		int math2 = 0;
		int total2 = 0; 		// 합계 접수를 입력할 수 있는 변수 선언
		double avg2 = 0;		// 실수형 타입을 생성해서 0의 값을 입력
				
		// 키보드를 통한 값 입력
		System.out.println("학번을 입력하세요.");
		number2 = scan.nextInt();
		System.out.println("이름을 입력하세요.");
		name2 = scan.next();
		System.out.println("국어 점수를 입력하세요.");
		kor2 = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng2 = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math2 = scan.nextInt();
		
		total2 = kor2+eng2+math2;
		avg2 = total2/3.0; 	// 분모에 3d 또는 (double)3으로 입력해도 됨
		
		System.out.println("[학생성적프로그램]");
		System.out.println("-----------------");		
		System.out.printf("번호 : %d \t", number2);
		System.out.printf("이름 : %s \t", name2);
		System.out.printf("국어 : %d \t", kor2);
		System.out.printf("영어 : %d \t", eng2);
		System.out.printf("수학 : %d \t", math2);
		System.out.printf("합계 : %d \t", total2);
		System.out.printf("평균 : %.2f \n", avg2);
		//System.out.println("평균 : "+avg2);

	}

}

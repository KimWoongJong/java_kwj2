package p0904;

import java.util.Scanner;

public class J0904_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 90점 이상이면 A, 80점 이상이면 B, 70점 이상 C, 60점 이상 D, F
		
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		System.out.println("점수 : "+score);
		
		
		
//		-------------------------------------------		
// 		숫자를 입력받아 0보다 크면 0 이상인 숫자입니다. 
// 		0보다 작으면 0 미만인 숫자입니다.
// 		0이면 0입니다. 
		
//		System.out.println("숫자를 입력하세요.");
//		int number = scan.nextInt();
//		
//		if(number>0){
//			System.out.println("0보다 큰 수입니다.");
//		}else if(number<0) {
//			System.out.println("0보다 작은 수입니다.");
//		}else {
//			System.out.println("0입니다.");
//		}
//		System.out.println("숫자 : "+number);
		
		
		
//		--------------------------------------------
// 		점수를 입력받아 60점 이상 합격
		
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		
//		if(score>=60) {
//			System.out.println("합격입니다.");
//		}
//		else {
//			System.out.println("불합격입니다.");
//		}
//		 
//		System.out.println("점수 : "+score);
	}//main

}//class

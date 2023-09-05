package p0905;

import java.util.Scanner;

public class J0905_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Math.random(); // 랜덤 숫자를 생성하는 메소드 : 0.0 <= x < 1.0
		int random = (int)(Math.random()*10)+1; // 1부터 10까지 랜덤 숫자를 생성
		
		for(int i=0;i<5;i++) {
			
			// 숫자를 입력받아 랜덤 숫자를 맞추는 프로그램을 구현하시오.
			System.out.println("숫자를 입력하세요.");
			int num = scan.nextInt();
			
			// 입력한 숫자와 랜덤 숫자가 맞는지 비교
			if(random==num) {
				System.out.println("정답입니다.");
				break; // 반복문을 중간에 종료할 때 사용하는 명령어
			}else {
				System.out.println("오답입니다.");
			}
			
		}//for
		
		//정답 출력
		System.out.println("랜덤 숫자 : "+random);
		
		
//		int i=0, sum=0;
//		for(i=1;i<=100;i++) {
//			sum=sum+i;
//			if(sum>=200) {
//				System.out.printf("%d, %d \n", i, sum);
//				break;
//			}
//		}
		
	}//main

}//class

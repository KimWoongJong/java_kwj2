package p0915_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class J0915_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("[ 하이마켓 쇼핑몰 로그인 ]");
		String id = "aaa";
		String pw = "1111";
		String name = "홍길동";
		
		Buyer b1 = new Buyer(id,name);
		int choice = 0;
		while(true) {
			System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("5. 현재잔액조회");
			System.out.println("8. 총구매목록");
			System.out.println("9. 금액충전");
			System.out.println("0. 프로그램종료");
			System.out.println("--------------------------");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				Tv t = new Tv();
				int check = 0;
				check = b1.buy(t);
				System.out.printf("결제 후 남은 금액 : %d \n", b1.money);
				System.out.printf("보너스 포인트 현황 : %d \n", b1.bonusPoint);
				System.out.println(check);
				
				break;
			
			case 2:
				
				
				
				break;
			
			case 3:
				break;
			
			case 4:
				break;
			
			case 5:
				break;
		
			case 8:
				break;
			
			case 9:
				break;
			
			case 0:
				break;
			
			}//switch
			
		}//while
		

		
	}//main

}//class

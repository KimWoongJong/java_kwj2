package p0905;

import java.util.Scanner;

public class J0905_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//랜덤숫자생성 1-100
		int random = (int)(Math.random()*100)+1;
		//System.out.println("임시 : "+random);
		System.out.println("[숫자 맞추기 게임]");
		
		//숫자맞추기
		while(true) {
			System.out.println("1-100 사이의 숫자를 입력하세요.");
			int num = scan.nextInt();
			if(random==num) {
				System.out.println("정답입니다.");
				break;
			}else if(random>num) {
				System.out.println("입력한 숫자보다 큰 수입니다.!!");
				System.out.println();
			}else {
				System.out.println("입력한 숫자보다 작은 수입니다.!!");
			}
		}//while
		
		System.out.println("랜덤 숫자 : "+random);
		
		
		

		
//		int i=0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
		
		
		
//		int i=0;
//		for(;;i++) {
//			System.out.println(i);
//		}
		
		
	}//main

}//class

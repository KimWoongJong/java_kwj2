package p0920;

import java.util.Scanner;

public class J0920_15 {

	public static void main(String[] args) {
		int a = -5;
		System.out.println(Math.abs(a)); //절대값
		
		double b = 12.912;
		System.out.println(Math.ceil(b)); //소수점 첫째자리 올림
		System.out.println(Math.floor(b)); // 소수점 첫째자리 버림
		System.out.println(Math.round(b)); // 반올림
		
		System.out.println("------------------------");
		int no1 = 10;
		int no2 = 15;
		int no3 = 13;
		
		System.out.println(Math.max(no1, no2)); //최대값 추출
		System.out.println(Math.min(no1, no2)); //최소값 추출
		
		// no1,no2,no3 최대값과 최소값을 출력하시오.
		
		Math.max(no1,no2);
		Math.min(no1,no2);
		System.out.println("------------------------");
		System.out.println(Math.max(Math.max(no1,no2), no3));
		System.out.println(Math.min(Math.min(no1,no2), no3));
		
		// 퀴즈
		// no1,no2,no3 작은 숫자 순으로 출력하시오. 10, 13, 15

		int maxNo = Math.max(Math.max(no1,no2), no3);
		int minNo = Math.min(Math.min(no1,no2), no3);
		int midNo = 0;
				
		if(no1 != maxNo && no1 != minNo) {
			midNo = no1;
		}else if(no2 != maxNo && no2 != minNo) {
			midNo = no2;
		}else {
			midNo = no3;
		}
		
		System.out.printf("%d, %d, %d",minNo,midNo,maxNo);
		
		
		// 세개 숫자 입력받아서 크기 비교 - 혼자 해결해보기 도전
		
		while(true) {
			
			int x=0,y=0,z=0;
			Scanner scan = new Scanner(System.in);
			System.out.println("세개의 숫자를 입력하세요.");
			x = scan.nextInt();
			y = scan.nextInt();
			z = scan.nextInt();
			
			int maxNo2 = Math.max(Math.max(x, y),z);
			int minNo2 = Math.min(Math.min(x, y),z);
			int midNo2 = 0;
			
			
			if(x != maxNo2 && x != minNo2) {
				midNo2 = x;
			}else if(y != maxNo2 && y != minNo2) {
				midNo2 = y;
			}else {
				midNo2 = z;
			}
			
			System.out.printf("%d, %d, %d",minNo2, midNo2, maxNo2);
			System.out.println();
		}//while
		
	}//main

}//class

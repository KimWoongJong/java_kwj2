package p0904;

import java.util.Scanner;

public class J0904_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 10, 5 두 수를 입력 받아 큰 수를 출력하시오.
		// 1. 두 수를 입력받아 출력하시오.
		// 2. 두 수를 비교해서 큰 수 출력
		
		
		// 두 수를 입력
		System.out.println("1번째 입력>>");
		int num1 = scan.nextInt();
		System.out.println("2번째 입력>>");
		int num2 = scan.nextInt();
		
		// 두 수를 비교
		if(num1>num2) {
			System.out.println("큰 수 : "+num1);
			System.out.println("작은 수 : "+num2);
		}else if(num1<num2) {
			System.out.println("큰 수 : "+num2);
			System.out.println("작은 수 : "+num1);
		}else {
			System.out.println("두 수가 같습니다.");
		}
		
		
		// 두 수를 출력
		System.out.printf("1: %d, 2: %d \n",num1,num2);
		
		
//		System.out.println("두 수를 입력하시오.");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		if(num1>num2) {
//			System.out.println("큰 숫자는 "+num1);
//		}else {
//			System.out.println("큰 숫자는 "+num2);
//		}
		
	}//main

}//class

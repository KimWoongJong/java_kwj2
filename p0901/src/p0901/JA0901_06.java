package p0901;

import java.util.Scanner;

public class JA0901_06 {
	
	public static void main(String[] args) {
//		System.out.println(10/8); // 1
//		System.out.println(10%8); // 2 나머지 연산
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
			
		int result = num%2; // 0 또는 1
		
		//조건문
		if(result==0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		
		System.out.println("입력한 숫자 : "+num);
		
	}

}

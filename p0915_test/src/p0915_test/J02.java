package p0915_test;

import java.util.Scanner;

public class J02 {

	public static void main(String[] args) {
		// 4개의 숫자를 입력받아, JMethod cal2메소드를 만들어
		// 4개 숫자 더하기와 곱하기를 한 결과값을 main에서 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수 사용
//		System.out.println("1번째 숫자를 입력하세요.");
//		int a = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요.");
//		int b = scan.nextInt();
//		System.out.println("3번째 숫자를 입력하세요.");
//		int c = scan.nextInt();
//		System.out.println("4번째 숫자를 입력하세요.");
//		int d = scan.nextInt();
//		
//		JMethod j = new JMethod(); // 객체선언
//		int result = j.cal2(a, b, c, d); 
//		// JMethod 클래스의 cal2메소드에서 return되는 값을 저장할 result 변수 선언
//		
//		System.out.println("----------------------------");
//		System.out.println("결과값 : "+result);

		// 2. 배열 사용
		int[] n = new int[4];
		for(int i=0;i<n.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.",i+1);
			n[i] = scan.nextInt();
		}
		
		
		JMethod j = new JMethod();
		//int result = j.cal2(n[0],n[1],n[2],n[3]);
		int result = j.cal2(n);
		System.out.println("결과값 : "+result);
		
		
	}

}

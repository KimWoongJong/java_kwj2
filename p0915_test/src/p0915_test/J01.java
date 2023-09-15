package p0915_test;

import java.util.Scanner;

public class J01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int n1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.");
		int n2 = scan.nextInt();

		// 4칙연산 총합을 구해서 출력
		// 객체선언 후 참조변수명.메소드명
		JMethod j = new JMethod();
		int result = j.calculate(n1,n2);
		
		System.out.println("결과값 : "+result);
		
	}

}

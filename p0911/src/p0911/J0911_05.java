package p0911;

import java.util.Scanner;

public class J0911_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 3개의 숫자를 입력받아 더하기, 빼기, 곱하기, 나누기를 출력하시오.
		
		int[] n = new int[7];
		int result = 0;
		
		for(int i=0;i<n.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			n[i] = scan.nextInt();
		}
		
		System.out.println("더하기 결과값 : ");
		result = add(n); // int[] n배열의 주소값을 매개변수로 보냄.
		System.out.println(result);
		
		System.out.println("빼기 결과값 : ");
		result = subtract(n);
		System.out.println(result);
		
		System.out.println("곱하기 결과값 : ");
		result = multiply(n);
		System.out.println(result);
		
		System.out.println("나누기 결과값 : ");
		result = divide(n);
		System.out.println(result);
		
	}//main
	
	static int add(int[] n) {
		int result = n[0];
		for(int i=1;i<n.length;i++) 
			result = result + n[i];
				
		return result;
	}
	
	static int subtract(int[] n) {
		int result = n[0];
		for(int i=1;i<n.length;i++)
			result = result - n[i];
		
		return result;
	}
	
	static int multiply(int[] n) {
		int result = n[0];
		for(int i=1;i<n.length;i++)
			result = result * n[i];
		
		return result;
	}
	
	static int divide(int[] n) {
		int result = n[0];
		for(int i=1;i<n.length;i++)
			result = result / n[i];
		
		return result;
	}
	
}//class

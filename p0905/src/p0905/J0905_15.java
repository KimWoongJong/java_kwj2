package p0905;

import java.util.Scanner;

public class J0905_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random()*100)+1;
		int[] arr = new int[10];
		int i=0;
		//System.out.println(ran);
		
		while(i<10) {
			System.out.println("숫자를 입력하시오.>>");
			int input = scan.nextInt();
			arr[i] = input;
			System.out.printf("%d", arr[i]);
			//System.out.println(ran);
			if(ran==input) {
				System.out.println("정답입니다.");
				System.out.println("");
				break;
			}else if(ran>input) {
				System.out.println("입력한 값보다 큰수입니다.");
			}else {
				System.out.println("입력한 값보다 작은수입니다.");
			}
			if(i==9) {
				break;
			}
		}
		
	}//main

}//class

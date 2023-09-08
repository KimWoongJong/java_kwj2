package p0908;

import java.util.Scanner;

public class J0908_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 객체배열
		Time[] t = new Time[3]; // 배열선언
//		t[0] = new Time(); // 1개의 시간저장변수 생성
//		t[1] = new Time();
//		t[2] = new Time();
		
		
		// 일반배열
//		int[] hour = new int[3];
//		int[] minute = new int[3];
//		double[] second = new double[3];
		
		for(int i=0;i<3;i++) {
			t[i] = new Time();
			System.out.println("시 입력 : ");
			t[i].hour = scan.nextInt();
			System.out.println("분 입력 : ");
			t[i].minute = scan.nextInt();
			System.out.println("초 입력 : ");
			t[i].second = scan.nextDouble();
		}//for
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d : %d : %.2f \n",
					t[i].hour, t[i].minute, t[i].second);
		}//for
		
	}//main

}//class

package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] myNo = new int[6];
		int temp=0;
		int count=0;
		
		// 로또 번호 1-45 생성
		for(int i=0;i<45;i++) {
			ball[i] = i + 1;
		}//for
//		for(int i=0;i<45;i++) {
//			System.out.print(ball[i]+" ");
//		}//for
//		System.out.println();
		
		// 로또 공 섞기
		for(int i=0;i<500;i++) {
			int random = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[random];
			ball[random] = temp;
		}
		
		// 로또 당첨번호 뽑기
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		
		// 내 번호 입력
		System.out.println("1-45까지의 번호 중 6개를 입력하시오.");
		for(int i=0;i<6;i++) {
			myNo[i] = scan.nextInt();
		}
		System.out.println();
		
		System.out.print("★★★★★★당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}//for
		//Arrays.sort(lotto);
		System.out.println();

		System.out.print("☆☆☆☆☆☆당신이 선택한 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(myNo[i]+" ");
		}
		//Arrays.sort(myNo);
		System.out.println();
		
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==myNo[j]) {
					count++;
				}
			}
		}
		System.out.print("당첨번호와 일치하는 숫자의 개수 : "+count);
		System.out.println();
		
	}//main

}//class

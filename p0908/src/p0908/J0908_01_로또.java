package p0908;

import java.util.Arrays;
import java.util.Scanner;

public class J0908_01_로또 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] myNo = new int[6];
		int[] prNo = new int[6];
		int temp = 0, random = 0, count = 0;
		
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
//		for(int i=0;i<45;i++) {
//			System.out.print(ball[i]+" ");
//		}
		
		for(int i=0;i<500;i++) {
			random = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[random];
			ball[random] = temp;
		}
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
			System.out.print(lotto[i]+" ");
		}
		
		System.out.println();
		System.out.println("1-45 사이의 숫자 6개를 입력하세요.");
		for(int i=0;i<6;i++) {
			myNo[i] = scan.nextInt();
		}
		
		System.out.print("당첨 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		Arrays.sort(lotto);
		System.out.println();
		
		System.out.print("입력 숫자 : ");
		for(int i=0;i<6;i++) {
			System.out.print(myNo[i]+" ");
		}
		Arrays.sort(myNo);
		System.out.println();
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==myNo[j]) {
					count++;
					prNo[j]=lotto[i];
					break;
				}//if
			}//for
		}
		System.out.println("일치하는 개수 : "+count);
		
		System.out.print("일치하는 번호 : ");
		for(int j=0;j<6;j++) {
			if(prNo[j]==0) {
				continue;
			}
			System.out.print(prNo[j]+" ");
		}
		
		
		
	}//main

}//class
package p0906;

import java.util.Arrays;

public class J0906_07 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int[] num = {1,2,3};
		num = score; // 주소를 복사한 것 -> 값을 복사한 것은 아니다.

		System.out.println(Arrays.toString(score));
		
		System.out.println("score : "+score);
		System.out.println("num : "+num);
	
	}//main

}//class

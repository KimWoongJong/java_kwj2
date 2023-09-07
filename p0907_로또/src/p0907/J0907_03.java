package p0907;

import java.util.Arrays;

public class J0907_03 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};  //1,2,3,4,5
		int[] score = new int[5]; //0,0,0,0,0
		
		//score = num; //얕은 복사, 주소 복사 <- 하면 안되는 복사(둘이 같아진다.)
		// 1. 배열 복사 방법 - for문 사용, 데이터값 전체를 다른 장소에 복사
//		for(int i=0;i<num.length;i++) {
//			score[i] = num[i];
//		}//for
		
		// 2. 배역 복사 방법 - arraycopy 메소드 사용, 데이터값 전체를 다른 장소에 복사
		// 1) 원본 배열 2) 위치 3) 복사 대상 배열 4) 위치 5) 복사 개수
		System.arraycopy(num, 1, score, 2, 2);
		num[0] = 20;

		System.out.println(num);
		System.out.println(score);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(score));
		
	}

}

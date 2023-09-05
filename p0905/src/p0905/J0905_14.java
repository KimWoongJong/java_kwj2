package p0905;

import java.util.Arrays;
import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10]; //배열 10개 생성
		
		// 1-100까지 랜덤 숫자를 생성해서 맞추는 프로그램을 구현하시오.
		// 1. 랜덤 숫자 생성
		int random = (int)(Math.random()*100)+1; // 1-100
		int i=0; // 초기식
		
		// 2. while 무한반복
		while(i<10) { // 조건식

			// 3. num 숫자 입려 받기
			System.out.println("1-100 사이의 숫자를 입력하시오.>>");
			int num2 = scan.nextInt(); // num2에 입력을 받음 - 50, 20, 30, 40, 31, 35
			num[i] = num2; // 입력한 숫자를 배열에 저장 num[0]=50, num[1]=20, num[2]=30, num[3]=40, num[4]=31, num[5]=35
			// 4. if를 사용해서 랜덤 숫자와 입력 숫자가 맞는지 비교
			// 5. 큰수, 작은수, 정답 - break;
			if(random==num2) {
				System.out.println("정답입니다.");
				break;
			}else if(random>num2){
				System.out.println("입력한 숫자보다 더 큰수입니다.");
			}else {
				System.out.println("입력한 숫자보다 더 작은수입니다.");
			}
			if(i==9) {
				break;
			}
			//System.out.println("랜덤 숫자 : "+random);
			i++; // 증감식
		}//while
		
		System.out.print("입력한 숫자 : ");
		for(int j=0;j<=i;j++) {
			System.out.printf("%d ",num[j]);
		}
		System.out.println();
		
		System.out.println("랜덤 숫자 : "+random);
		
		
		
//		System.out.println(num); //메모리의 주소값이 나옴
//		System.out.println(Arrays.toString(num)); //배열 내 값을 모두 불러냄
		
	}//main
}//class

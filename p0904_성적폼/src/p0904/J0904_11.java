package p0904;

public class J0904_11 {

	public static void main(String[] args) {
		
		// 1부터 100까지의 합 : 5050
		// 1부터 100까지의 합에서 합이 200을 넘는 때는 언제일까요? i를 출력하세요.
		
		
		// 1. 1부터 100까지의 합을 구함.
		// 2. 조건문을 사용해서 sum 200 이상일 때를 구함.
		
		int i=0, sum=0;
		for(i=1;i<=100;i++) {
			sum = sum + i;
			if(sum>=200 && sum-i<200) {
				System.out.printf("200을 넘는 시점의 i : %d, 합 : %d \n", i, sum);
			}
		}
		System.out.printf("1부터 %d까지의 합 : %d", i-1, sum);
		
		
//		1부터 100까지의 합을 출력하시오.
//		int i=0, sum=0;
//		for(i=1;i<=100;i++) {
//			sum = sum + i;
//		}
//		System.out.printf("1부터 %d 까지의 합 : %d \n",i-1,sum);
		
//		int i=0;
//		int sum=0;		
//		for(i=1;i<=1000;i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		
//		System.out.println("for문 밖 i : "+i);
//		System.out.println("for문 밖 sum : "+sum);
		
	}//main

}//class

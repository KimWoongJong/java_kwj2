package p0905;

public class J0905_07 {

	public static void main(String[] args) {
		// 1-100까지 순번과 합을 출력하시오.
		// for문
		// while문
		
		int i=0, sum=0;
		while(i<100) {
			i++;
			sum=sum+i;
			System.out.printf("순번 : %d, 합 : %d \n",i,sum);
		}//while
		
//		int i=0, sum=0;
//		for(i=1;i<=100;i++) {
//			sum=sum+i;
//			System.out.printf("순번 : %d, 합 : %d \n",i,sum);
//		}//for
		
	}//main

}//class

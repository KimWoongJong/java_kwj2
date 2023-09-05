package p0905;

public class J0905_06 {

	public static void main(String[] args) {

		//구구단 while		
		int i=2; // 초기화
		while(i<=9) { // 조건식
			int j=1; // 초기화
			while(j<=9) { // 조건식
				System.out.printf("%d * %d = %d \n",i,j,i*j);
				j++; // 증감식
			}
			i++; // 증감식
			System.out.println();
		}//while
		
		

		
		
		//구구단
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \n", i, j, i*j);
//			}
//		}
		
		
		
//		int i=10;
//		while(i<=10 && i>=0) {
//			System.out.println(i);
//			i--;
//		}
		
		
		
		
		// 초기화는 while문 안에 넣으면 안됨
//		int i = 10;
//		while(i>=0) {
//			//i=10; //초기값을 while문 안에 넣으면 안됨
//			System.out.println(i);
//			i--;
//		}
		
		
		//while
//		int i=10;
//		while(i>=0) {
//			System.out.println(i);
//			i--;
//		}
		
		
//		for(int i=10;i>=0;i--) {
//			System.out.println(i);
//		}
		
	}//main

}//class

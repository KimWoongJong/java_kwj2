package p0908;

public class J0908_09 {

	public static void main(String[] args) {
		// Spade-13장, Heart-13장, Diamond-13장, Clover-13장
		// 배열선언
		Card[] c = new Card[52];
		String[] shape = {"Spade","Heart","Diamond","Clover"};
		// 객체선언 후 사용가능
		
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(); // 객체선언
			c[i].number = (i%13)+1; // 52장의 카드를 1-13 4세트로 만들기
			//shape : 0-12:Spade, 13-25: Heart, 26-38: Diamond, 39-51: clover
			c[i].kind = shape[i/13]; 
		}
		
		System.out.println("Card number : ");
		for(int i=0;i<c.length;i++) {
			System.out.printf("%d,%s \n",c[i].number,c[i].kind);
		}
		System.out.println("----------------------------------");
		
		
		
		//배열
//		int[] num = new int[13];
//		// 1-13을 입력해보세요.
//		// for문 사용해서
//		
//		for(int i=0;i<13;i++) {
//			num[i] = i + 1;
//			System.out.print(num[i]+" ");
//		}
//		
		
		
		
	}//main

}//class

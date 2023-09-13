package p0913;

public class J0913_01 {

	public static void main(String[] args) {
		// 카드 52장을 생성해서 숫자와 모양을 입력하소, 카드를 섞은 후, 처음부터 5장을 출력하시오.
		// Card, Deck, main 3개
		// 포함관계(객체선언)로 구성해서 프로그램을 구현하시오.
		
		
		
		Deck d = new Deck();
		d.Shuffle();
		d.cardPrint();
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("섞은 카드 중 5장을 처음부터 나열하면");
		d.pick5();
		System.out.println();
		System.out.println("------------");
		System.out.println("------------");
		
		//a,b
		Card[] a = new Card[5];
		Card[] b = new Card[5];
		System.out.println("a : 카드 5장");
		for(int i=0;i<5;i++) {
			a[i] = d.pick(i);
			System.out.println("a[i]");
		}
		
		System.out.println("b : 카드 5장");
		for(int i=0;i<5;i++) {
			b[i] = d.pick(i+5);
			System.out.println(b[i]);
	
		}
		//a[0] = new Card(); // 객체선언 - 저장할 수 있는 공간
		
		// a:5장 - a라는 배열을 만든 후 5장을 저장해서 출력
		// b:5장 - b라는 배열을 반든 후 5장을 저장해서 출력
		
		

	}

}

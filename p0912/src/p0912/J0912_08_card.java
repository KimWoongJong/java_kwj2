package p0912;

public class J0912_08_card {

	public static void main(String[] args) {

		Deck d = new Deck();
		d.cardPrint();
		d.shuffle();
		System.out.println("--------------------------");
		d.cardPrint();
		System.out.println("--------------------------");
		System.out.println("카드 한 장 출력 : ");
		System.out.println(d.pick(3));
		System.out.println("--------------------------");
		System.out.println(d.pick());
		
		
		
		//13장 - Spade, 1-13
//		Card[] c = new Card[52];
//		String[] shape = {"Spade","Heart","Diamond","Clover"};
//		
//		for(int i=0;i<c.length;i++) {
//			c[i] = new Card();
//			c[i].kind = shape[i/13];
//			c[i].number = i%13 + 1;
//			System.out.println(c[i]);
//		}
		
		
		
//		Card c = new Card();
//		c.kind = "Spade";
//		c.number = 1;
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 2;
//		
//		System.out.println(c); // toString()이 없으면 주소값이 나옴 <- 이게 정상 
//		System.out.println(c2); // but, toString() 메소드가 있으면 클래스를 찾는다.
		
	}

}

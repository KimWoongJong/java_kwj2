package p0908;

public class J0908_08 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 1;
		
		Card c2 = new Card();
		c2.kind = "Diamond";
		c2.number = 2;
		
		Card c3 = new Card();
		c3.kind = "Clover";
		c3.number = 3;
		
		Card c4 = new Card();
		c4.kind = "Spade";
		c4.number = 4;
		
		System.out.println("c1 : "+c1.kind+","+c1.number);
		System.out.println("c2 : "+c2.kind+","+c2.number);
		System.out.println("c3 : "+c3.kind+","+c3.number);
		System.out.println("c4 : "+c4.kind+","+c4.number);
		
	}

}

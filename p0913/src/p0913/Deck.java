package p0913;

public class Deck {
	
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	Card[] c = new Card[52];
	
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].kind = shape[i/13];
			c[i].number = (i%13)+1;
		}//for
	}//Deck
	
	Card pick(int no) {
		int random = (int)(Math.random()*52);
		return c[random];
	}
	
	void Shuffle() {
		for(int i=0;i<1000;i++) {
			int random = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}//for
	}//Shuffle
	
	void cardPrint() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}//for
	}//cardPrint
	
	void pick5() {
		for(int i=0;i<5;i++) {
			if(i==0) {
				System.out.print(c[i]);
				continue;
			}
			System.out.print(", "+c[i]);
		}//for
	}//pick5
	
}

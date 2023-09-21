package p0921;

public class ColAction2 {
	
	Card[] card = new Card[52];
	String[] kind = {"Spade","Heart","Diamond","Clover"};

	void cardAll() {

		// 52장의 카드를 출력하시오.
		for(int i=0;i<card.length;i++) {
			int number = i%13+1;
			String shape = kind[i/13];
			card[i] = new Card(number,shape);
		}//for
		
	}
	
	Card[] cardInsert() {
		cardAll();
		return card;
	}	
	
	
	
	
}//class

package p0921;

public class J0921_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColAction2 col2 = new ColAction2();
		Card[] card = col2.cardInsert();
		
		for(int i=0;i<card.length;i++) {
			System.out.print(card[i].getNumber()+", ");
			System.out.println(card[i].getKind());
			
		}//for
		
	}//main

}//class

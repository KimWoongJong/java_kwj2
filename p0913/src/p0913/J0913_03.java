package p0913;

import p0913_02.CCard;

public class J0913_03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 1;
		c1.flag = 1; // private은 같은 클래스에서만 사용 가능
		System.out.printf("%s, %d",c1.kind,c1.number);
		System.out.println();
		System.out.printf("%s, %d,%d",c1.kind,c1.number,c1.flag);
		
		//CCard c2 = new CCard();
		System.out.println();
		CCard c2 = new CCard(); // public은 모든 패키지 내에서 사용 가능
		
		
		
	}

}

package p0911;

public class Card {
	
	String kind; // 인스턴스변수 - 객체선언 후 참조변수명.변수명
	int number;
	
	static int width = 100; // 클래스변수 - 객체선언 없이 클래스명.변수명
	static int height = 250;
	
	void cardPrint() {
		System.out.printf("kind : %s, number : %d \n",kind,number);
	}

}

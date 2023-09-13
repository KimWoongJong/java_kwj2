package p0913;

public class Card {
	
	String kind;
	int number;
	private int flag;
	
	String[] cardshape = {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public String toString() {
		return String.format("[%s, %s]", kind, cardshape[number]);
	}
	
}

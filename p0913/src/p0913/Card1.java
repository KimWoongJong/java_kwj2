package p0913;

public class Card1 {
	
	String kind;
	int number;
	String[] cardshape = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public String toString() {
		return String.format("[%s, %s]", kind, cardshape[number]);
	}
	
}

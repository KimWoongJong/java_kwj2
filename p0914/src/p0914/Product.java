package p0914;

public class Product {
	String name;
	int price;
	int bonusPoint;

	public String toString() {
		return String.format("%s, %d, %d",name,price,bonusPoint);
	}
	
}

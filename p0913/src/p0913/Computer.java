package p0913;

public class Computer extends Product {
	
	String cpu;
	
	Computer(){
		this("LG컴퓨터16",2000000,20000,"i5-1240P");
		
	}
	
	Computer(String pName, int price, int bonusPoint, String cpu){
		this.pName = pName;
		this.price = price;
		this.bonusPoint = bonusPoint;
		this.cpu = cpu;
	}
	
}

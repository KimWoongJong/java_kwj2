package p0915_학생성적;

public class Computer extends Product {
	
	String cpu;
	
	Computer(){
		name = "LG컴퓨터";
		price = 2000000;
		bonusPoint = price/100;
		cpu = "i5-1240P";
	}

}

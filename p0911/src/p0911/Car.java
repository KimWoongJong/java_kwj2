package p0911;

public class Car {

	String color; //인스턴스 변수
	String gearType;
	int door;
	
	Car(){} //기본생성자
	
	//매개변수가 있는 생성자
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	
}//class

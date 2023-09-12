package p0912;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){ // 기본생성자
		this("white","auto",5); // 다른 생성자 호출 시, this() <- 문장의 가장 첫번째 줄에 올 수 잇음
//		color = "white";
//		gearType = "auto";
//		door = 5;
	}
	
	Car(Car c){
		this(c.color,c.gearType,c.door); // this() : 다른 생성자 호출
	}
	
	Car(String color, String gearType, int door){
		this.color = color; // 인스턴스 변수에 값을 보내고 싶을 때, this를 붙인다.
		this.gearType = gearType;
		this.door = door;
	}

}

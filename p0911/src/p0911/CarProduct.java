package p0911;

public class CarProduct {

	public static void main(String[] args) {
		//기본생성자를 이용한 방법
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 5;
		
		Car c2 = new Car();
		c2.color = "red";
		c2.gearType = "auto";
		c2.door = 4;
		
		Car c3 = new Car();
		c3.color = "black";
		c3.gearType = "auto";
		c3.door = 5;
		
		//매개변수가 있는 생성자를 이용한 방법
		Car c4 = new Car("silver","auto",5);
		Car c5 = new Car("green","auto",4);
		Car c6 = new Car("pink","stick",5);
	}

}//class



package p0912;

public class J0912_01 {

	public static void main(String[] args) {
		Time t = new Time(); // 매개변수가 없는 기본생성자 호출
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(10); // 기본생성자가 자동으로 생성되지 않으므로 에러가 발생함. 매개변수 입력 필요.
		
		Car c1 = new Car();
		System.out.println(c1.color);
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 5;
	
		
		Car c2 = new Car("red","auto",5);
		System.out.println(c2.color); //red
		System.out.println(c2.gearType);
		
		
	}//main

}

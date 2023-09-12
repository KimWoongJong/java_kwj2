package p0912;

public class J0912_04 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "red";
		System.out.println("c1.color : "+c1.color);
		System.out.println("c1.gearType : "+c1.gearType);
		System.out.println("c1.door : "+c1.door);
		
//		주소값이 복사되어 c1과 c2가 같아짐.
//		Car c2 = c1;
//		c2.color = "blue";
//		System.out.println("다시호출 c1.color : "+c1.color);

		
		System.out.println("===================================");
		Car c2 = new Car(c1); // 객체 선언(생성)을 하면 저장 장소가 무조건 새롭게 만들어진다. 그러므로 c1과 c2의 주소값은 다르다
		System.out.println("c2.color : "+c2.color);
		c2.color = "pink";
		System.out.println("다시호출c1.color : "+c1.color);
		System.out.println("다시호출c2.color : "+c2.color);
		
		
	}

}

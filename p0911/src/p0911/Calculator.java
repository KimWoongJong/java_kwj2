package p0911;

public class Calculator {

	//Calculator(){} //기본생성자
	public static void main(String[] args) {
		Cal1 c1 = new Cal1();
		c1.value = 10;
		System.out.println(c1.value);
		Cal2 c2 = new Cal2(10);
		//c2.value = 10; 생략
		System.out.println(c2.value);
		
	}//main
}//class

class Cal1{
	//Cal1(){} //기본생성자
	int value; //인스턴스 변수 - 객체선언 후 참조변수명.변수명
}//Cal1

class Cal2{
	int value; //인스턴스 변수 - 객체선언 후 참조변수명.변수명
	// 기본생성자가 안 만들어짐.
	Cal2(){} //기본생성자 <- 생성자가 한 개라도 있을 경우에는 컴파일러가 기본생성자를 만들어주지 않음!!!
	Cal2(int x){ //매개변수1개가 있는 생성자
		value = x;
	}
}//Cal2



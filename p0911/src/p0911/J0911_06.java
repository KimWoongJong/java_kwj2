package p0911;

public class J0911_06 {

	public static void main(String[] args) {
		Data d = new Data(); // 객체선언
		d.x = 10;
		System.out.println("d.x : "+d.x);
		change(d.x);
		System.out.println("2 d.x : "+d.x);
		
	}//main

	// 클래스메소드 - 객체선언 없이 클래스명.메소드명
	static void change(int x) {
		x = 1000;
		System.out.println("메소드 x : "+x);
	}
	
}//class


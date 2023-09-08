package p0908;

public class J0908_10 {

	public static void main(String[] args) {
		int result = 0;

		//result = 10+3;
		
		System.out.println(add(10,3));
		
//		result = 222+234;
		System.out.println(add(222,234));
		
//		result = 21+99;
		System.out.println(add(21,99));
		
//		result = 787+676;
		System.out.println(add(787,676));
		
//		result = 1127+458;
		System.out.println(add(1127,458));
		
	}//main

	
	// 메소드 정의
	static int add(int a, int b) { // 현재 동일 클래스 내이므로 메소드명 만으로 호출 가능
		int result = 0;
		result = a + b;
		return result;
	}//add
	
	
	
	
	
	
	
}//class

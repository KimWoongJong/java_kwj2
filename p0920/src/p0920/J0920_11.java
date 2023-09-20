package p0920;

public class J0920_11 {

	public static void main(String[] args) {
		String str = "Hello World";
		String input = "hello world";
		if(str.equals(input)) { // equalsIgnoreCase : 대소문자 구분없이 비교
			System.out.println("str,input 같음");
		}else {
			System.out.println("str,input 다름");
		}
		System.out.println("---------------------------");
		
		String str2 = str.toLowerCase(); // 소문자로 바꾸는 기능
		if(str2.equals(input)) {
			System.out.println("str,input 같음");
		}else {
			System.out.println("str,input 다름");
		}
		
	}//main

}//class

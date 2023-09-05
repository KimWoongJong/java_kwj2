package p0901;

public class JA0901_03 {

	public static void main(String[] args) {
//		int a = 1000000;
//		int b = 1000000;
//		long c = (long)a * b;
//		System.out.printf("%,d",c);

		char c1 = 'a';
		System.out.println(c1);
		System.out.printf("%s \n", c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);
		
		char c4 = (char)(c2+1); // char로 타입이 이미 반영된 경우 강제 형변형 필요
		System.out.println(c4);
		
		char c5 = ++c2;
		System.out.println(c5);
		
		char c6 = 48; 			// 0 -> 48
		System.out.println(c6);
		System.out.println((char)(c6+1)); // 아스키코드 1이 뜸
				
		System.out.println("------------------------------");
		// 아스키코드에서 문자 숫자를 숫자로 바꾸고 싶을 때는 문자 0을 빼준다 -> 아스키코드 값끼리의 차가 그 숫자가 됨
		int i = '4'-'0';
		System.out.println(i);
		
		int i2 = '7'-'0'; // 문자형 숫자를 int타입으로 변경하는 방법은 '0'을 빼주면 됨. int타입 변경
		System.out.println(i2);
		
		
	}

}

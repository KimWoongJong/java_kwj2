package p0830;

public class JA0830_02 {

	public static void main(String[] args) {
		boolean bo = true;
		boolean bo2 = false;
		char ch = 'a';
		char ch2 = 'b';
		byte by = 1;
		short sh = 2;
		int a = 1;
		int b = 20;
		int in = 2100000000;
		long lo = 10000000000L;// 100억이 넘어가면 접미사 L(소문자도 가능)을 붙여야 함 (21억 이하는 알아서 인식하지만 L을 넣어줘도 문제 없음) <- 정수형에서 표준 변수형이 int이기 때문
		float fl = 1.2F;// float에 접미사 F(소문자도 가능)를 붙여야 함 <- 실수형에서 표준 변수형이 double이기 때문
		double d = 11.12;
		double dou = 1.2;

		int c = 5000;
		String str = new String("kimwoongjong");

		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println(ch);

		System.out.println(c);
		System.out.println(str);
	}

}

package p0831;

public class JA0831_06 {

	public static void main(String[] args) {
		int x = 2147483647;
		int total=0;
		total = x + 5;
				
		System.out.println(total); // 오버플로우
		
		int a = 1000000;
		int b = 1000000;
		System.out.println(a+b);
		System.out.println(a*b);
	}

}

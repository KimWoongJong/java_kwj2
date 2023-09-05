package p0831;

public class JA0831_14 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = a * b; // int * int = int
		System.out.println(c);
		
		int x = 1000000;
		int y = 1000000;
		long z = (long)x*y; // long * int = long, long * long = long
		System.out.println(z);
		
		long num = (long)a * x / y;
		System.out.println(num);
		
		long num2 = (long)a/x*y;
		System.out.println(num2);
		
		int i = 1;
		int j = 1;
		i = i + j; // i=2
		i += j;
	}

}

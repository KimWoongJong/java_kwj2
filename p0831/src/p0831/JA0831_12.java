package p0831;

public class JA0831_12 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = ++i;
		
		//System.out.println(i); //6
		//System.out.println(j); //6
		
		int a = 5;
		int b = 0;
		
		b = a++;
		
		//System.out.println(a); //6
		//System.out.println(b); //5
		
		// b = a++; 대입연산자를 함께 사용하지말 것, 분리해서 사용할 것
		
		int x = 5;
		int y = 0;
		int z = 5;
				
		x++;
		y = x;
		
		System.out.println(x==y); //true
		System.out.println(x!=y); //false
		System.out.println(x!=z); //true
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2); //8가지 기본형타입은 등가비교 사용(8가지 기본형 변수 외에는 등가비교 불가)
		System.out.println(str1.equals(str2)); //참조변수는 equals 명령어 사용해야 함.(참조 변수 비교를 하기 위한 방법)
		
		
	}

}

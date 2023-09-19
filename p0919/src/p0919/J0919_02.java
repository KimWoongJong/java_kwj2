package p0919;

public class J0919_02 {

	public static void main(String[] args) {
		
		KorPerson k1 = new KorPerson("880101-1101111","홍길동");
		KorPerson k2 = new KorPerson("880101-1101111","홍길동");
		KorPerson k3 = new KorPerson("991231-2202222","유관순");
		
		if(k1.equals(k2)) { // equals()안의 k2는 매개변수로 KorPerson class equals의 object를 가리킴
			System.out.println("k1, k2는 같은 사람입니다.");
		}else {
			System.out.println("k1, k2는 다른 사람입니다.");
		}
		System.out.println(k1); // 클래스 내 toString 정의가 되어 있어야 값이 나옴(그렇지 않으면 @주소값이 나옴)
		System.out.println(k2);
		System.out.println("--------------------------------");
		if(k1.equals(k3)) {
			System.out.println("k1, k3는 같은 사람입니다.");
		}else {
			System.out.println("k1, k3는 다른 사람입니다.");
		}
		System.out.println(k1);
		System.out.println(k3);
		System.out.println("--------------------------------");
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = "유관순";
		if(str1.equals(str2)) {
			System.out.println("str1, str2는 같은 사람입니다.");
		}else {
			System.out.println("str1, str2는 다른 사람입니다.");
		}
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("--------------------------------");
		if(str1.equals(str3)) {
			System.out.println("str1, str3는 같은 사람입니다.");
		}else {
			System.out.println("str1, str3는 다른 사람입니다.");
		}
		System.out.println(str1);
		System.out.println(str3);
		
		
	}

}

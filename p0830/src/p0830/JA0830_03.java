package p0830;

public class JA0830_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM3 = 100; // 상수선언
		int num1 = 550; 	  // 변수선언
		int num2 = 150;		  // 변수는 선언한 후 값이 들어가야 함. 값이 들어가기 전에 사용 시 에러 발생
		int temp = 0;
		int temp2 = 0;
		int company_intro;
		int companyIntro; // 낙타형 camel표기형 <- 오타 방지를 하기 위함
		
		System.out.println(temp);
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		num1 = 10;
		num1 = 300;
		
		System.out.println(550+150);
		System.out.println(550-150);
		System.out.println(550*150);
		System.out.println(550/150);
		System.out.println(550%150);

	}

}

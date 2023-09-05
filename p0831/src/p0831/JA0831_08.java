package p0831;

public class JA0831_08 {

	public static void main(String[] args) {
		int age = 20;
		String address = "서울특별시 구로구 구로동";
		// 당신의 나이는 20세, 사는 곳은 서울특별시 구로구 구로동 입니다.
		
		System.out.println("당신의 나이는 "+age+"세, 사는 곳은 "+address+" 입니다.");
		System.out.println("------------------------------------");
		System.out.printf("당신의 나이는 %d세, 사는 곳은 %s 입니다. \n", age, address);
		System.out.println("------------------------------------");
		
		// 국어, 영어, 수학 평균을 출력 소수점 2자리까지 출력하시오.
		// 100, 100, 99
		
		int kor = 100;
		int eng = 100;
		int math = 99;
		int total = kor + eng + math;
		double avg = total/3.0;
		
		System.out.printf("국어 점수 : %d점 \n", kor);
		System.out.printf("영어 점수 : %d점 \n", eng);
		System.out.printf("수학 점수 : %d점 \n", math);
		System.out.printf("총점 : %d점 \n", total);		
		System.out.printf("국어, 영어, 수학의 평균 점수는 %.2f점 입니다 \n", avg);
		
		System.out.println("------------------------------------");
		
		System.out.printf("%04.2f \n", 5.8); // 5.80 <- 4자리
		System.out.printf("%05.2f \n", 5.8);
	}

}

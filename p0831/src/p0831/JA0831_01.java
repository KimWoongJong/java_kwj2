package p0831;

public class JA0831_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int kor=0;
		int eng=0;
		double avg=0; //평균
		kor=98;
		eng=91;
		total = kor + eng;
		avg = total/2.0; // int형 끼리 계산을 하게 되면 실수형 변수가 선언되어도 소수점 이하는 .0으로만 나옴 <- 억지로 실수형을 하나 넣어줘야 함
		System.out.println("합계 : ");
		System.out.println(total);
		System.out.println("평균 : ");
		System.out.println(avg);
	}

}

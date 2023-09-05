package p0831;

public class JA0831_04 {

	public static void main(String[] args) {
		String name = new String("이름 : 김웅종");
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		int avg = 0;
		
		kor=99;
		eng=98;
		math=100;
		total = kor + eng + math;
		avg = total/3;
		
		
		System.out.println(name);
		System.out.print("국어 : ");
		System.out.println(kor);
		System.out.print("영어 : ");
		System.out.println(eng);
		System.out.print("수학 : ");
		System.out.println(math);
		System.out.print("총점 : ");
		System.out.println(total);
		System.out.print("평균 : ");
		System.out.println(avg);
		
		char grade = 'A';
		char grade2 = ' '; // char타입은 아무값을 넣지 않으려면 공백을 띄워줌. (스페이스도 문자로 인식함 <- 공간을 띄우지 않으면 에러 발생)
		String str = ""; // String탕비은 상관없음. (띄우지 않아도 에러 발생 안함)

	}

}

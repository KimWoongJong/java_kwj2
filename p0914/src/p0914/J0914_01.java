package p0914;

public class J0914_01 {

	public static void main(String[] args) {

		// 1. 기본생성자를 호출해서 값을 입력하는 방법
		StuScore s1 = new StuScore(); // 객체 선언
		s1.setStuNo(1);
		System.out.println("학생번호 : "+s1.getStuNo());
//		s1.setName("홍길동");
//		s1.setKor(100);; // 200
//		s1.setEng(100);;
//		s1.setMath(100);
//		s1.setTotal(s1.getKor()+s1.getEng()+s1.getMath());
//		s1.setAvg(s1.getTotal()/3.0);
		
		
		// 생성자 - 객채생설 때 초기화 메소드 - 데이터 입력
		// 2. 전체 매개변수 생성자 
		StuScore s2 = new StuScore(1,"홍길동",100,100,100);
		System.out.println("학생번호 : "+s2.getStuNo());
		
		
	}//main

}//class

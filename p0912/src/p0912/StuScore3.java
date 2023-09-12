package p0912;

public class StuScore3 {
	
	StuScore3(){}
	StuScore3(int stuNo, String name, int kor, int eng, int math) {
		this.stuNo = stuNo; //this를 입력하지 않으면 지역 변수를 가리킴
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} // 직접 다 칠 필요가 없도록 만들어주는 기능이 있음 <- 마우스 우측 버튼 - Source - Generate Constructor Using Fields
	
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
}

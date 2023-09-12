package p0912;

public class StuScore {
	
	StuScore(){} //기본생성자
	StuScore(int stuNo,String name, int kor, int eng, int math){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
}
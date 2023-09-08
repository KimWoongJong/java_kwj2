package p0908;

public class StuScore {

	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	void total() {
		total = kor+eng+math;
	}
	
	void avg() {
		avg = total/3.0;
	}
	
}

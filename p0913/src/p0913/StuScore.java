package p0913;

public class StuScore {
	
	public StuScore() {} // 기본생성자
	public StuScore(int stuNo, String name, int kor, int eng, int math) { // 생성자
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	
	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
}

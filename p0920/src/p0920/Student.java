package p0920;

public class Student {
	
	Student(){}
	Student(int num){
		this.stuNum = stuNum;
	}
	
	// 새로운 객체를 복사
	Student(Student s){
		this.stuNum = s.getStuNum();
	}
	
	private int stuNum;

	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	
	public boolean equals(Object obj) {
		boolean temp=false;
		Student s2 = (Student)obj;
		if(this.stuNum==s2.getStuNum()) {
			temp=true;
		}
		return temp;
	}
	
}

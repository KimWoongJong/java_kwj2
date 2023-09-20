package p0920;

public class J0920_01 {

	public static void main(String[] args) {
		Student s1 = new Student(1001);
		System.out.println(s1.getStuNum());
		
		Student s2 = new Student(1001);
		Student s3 = new Student(1003);
		
		if(s1.getStuNum()==s2.getStuNum()) {
			System.out.println("s1,s2는 같은 학생입니다.");
		}else {
			System.out.println("s2,s2는 다른 학생입니다.");
		}
		
		System.out.println("-------------------------------");
		
		if(s1.equals(s2)) {
			System.out.println("s1,s2는 같은 학생입니다.");
		}else {
			System.out.println("s1,s2는 다른 학생입니다.");
		}
		
	}

}

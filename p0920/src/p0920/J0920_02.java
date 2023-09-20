package p0920;

import java.util.ArrayList;

public class J0920_02 {

	public static void main(String[] args) {
		Student s1 = new Student(1001);
		System.out.println("s1 : "+s1);
		System.out.println("s1.getStuNum() : "+s1.getStuNum());
		Student s2 = new Student(1002);
		Student s3 = new Student(1003);
		Student s4 = new Student(1004);
		
		ArrayList<Student> list = new ArrayList(); // <>안에 Student만을 넣겠다는 선언 - generic
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println(list.size()); //list개수
		System.out.println("list s1 : "+list.get(0));
		System.out.println("s1.getStuNum() : "+list.get(0).getStuNum());
		
	}

}

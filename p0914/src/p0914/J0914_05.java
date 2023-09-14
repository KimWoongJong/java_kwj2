package p0914;

import java.util.ArrayList;

public class J0914_05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add("안녕");
		list.add(5.4);
		Tv t = new Tv();
		list.add(t); // toString 선언을 하지 않고 하면 주소값만 나옴
		list.remove(5); // "안녕" 삭제
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		
		
		
	}

}

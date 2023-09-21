package p0921;

import java.util.ArrayList;

public class J0921_06 {

	public static void main(String[] args) {
		// ArrayList
		// white,5 red,4 black,5 gray,5 blue,4
		// Car 객체 5개를 list에 추가해서 출력하시오.
		
		ArrayList<Car> list = new ArrayList();
		list.add(new Car("white", 5));
		list.add(new Car("red", 4));
		list.add(new Car("black", 5));
		list.add(new Car("gray", 5));
		list.add(new Car("blue", 4));
		
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i).color+",");
			System.out.println(list.get(i).door);
		}
		
	}//main

}//class

package p0921;

import java.util.ArrayList;
import java.util.Vector;

public class J0921_05 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList(); // ArrayList<Card> generic 하면 저장된 값 출력됨
		list.add(new Card(1,"Spade")); // list.add(Object o);
		list.add(new Card(2,"Spade"));
		list.add(new Card(3,"Spade"));
		list.add(new Card(4,"Spade"));
		list.add(new Card(1,"Spade"));
		
		// list를 출력하시오.
		
		for(int i=0;i<list.size();i++) {
			//Card c = (Card)list.get(i);
			System.out.print(list.get(i).getKind()); // Card 클래스에 toString 선언된 경우 저장된 값 출력됨
			System.out.println(list.get(i).getNumber()); // Card 클래스에 toString 선언된 경우 저장된 값 출력됨
			
		}//for
		
		
		
		
//		ArrayList list = new ArrayList(); // 싱글쓰레드
//		//Vector list2 = new Vector(); 	  // 멀티쓰레드
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.add(2);
//		list.add(5);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
		
	}

}

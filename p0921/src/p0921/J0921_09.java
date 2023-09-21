package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class J0921_09 {
	
	public static void main(String[] args) {
		
		ColAction col = new ColAction();
		//list출력, list2출력
		//HashMap으로 list,list2 2개를 포함해서 넘겨받음
		HashMap<String, Object> map = col.scoreAll();
		ArrayList<StuScore> list = (ArrayList<StuScore>) map.get("list");
		ArrayList<Car> list2 = (ArrayList<Car>) map.get("list2");
		
		for(int i=0;i<list.size();i++) {
			StuScore s = list.get(i);
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
					s.getStuNum(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		for(int i=0;i<list2.size();i++) {
			System.out.print(list2.get(i).getColor()+", ");
			System.out.println(list2.get(i).getDoor());
		}
		
		
		// list를 전달받아 출력하시오.
		
//		ArrayList<StuScore> list = col.scoreAll();
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		
//		for(int i=0;i<list.size();i++) {
//			StuScore s = list.get(i);
//			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
//					s.getStuNum(),s.getName(),s.getKor(),s.getEng(),
//					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
//		}//for
		
		
//		ArrayList<Car> list2 = col.scoreAll();
//		for(int i=0;i<list2.size();i++) {
//			System.out.print(list2.get(i).getColor()+", ");
//			System.out.println(list2.get(i).getDoor());
//		}
		
		
		//카드 52장 출력
//		Card[] card = col.cardInsert();
//		System.out.println(card[0].getKind());
//		System.out.println(card[0].getNumber());
//		
//		System.out.println("-----------------");
//		
//		
//		for(int i=0;i<card.length;i++) {
//			System.out.printf("%d,%s \n",card[i].getNumber(),card[i].getKind());
//		}
//		
		
		//카드1장 출력
//		Card c = col.cardInsert();
//		System.out.printf("%d,%s",c.getNumber(),c.getKind());
		
	}//main

}//class

package p0914;

import java.util.ArrayList;

public class J0914_08 {

	public static void main(String[] args) {
		Card[] c = new Card[4];
		// 1) 배열크기제한 2) 같은타입만 가능 3) 삭제 불가 4) 사이에 추가 불가
		c[0] = new Card("Spade",1);
		c[1] = new Card("Heart",1);
		c[2] = new Card("Diamond",1);
		c[3] = new Card("Clover",1);
//		c[4] = new Card("Clover",2);
//		c[5] = new Card("Clover",3);
		
		for(int i=0;i<c.length;i++) {
			System.out.printf("[%s, %d] \n",c[i].kind,c[i].number);
		}
		
		System.out.println("-------------------------------------");
		// 1) 배열의 크기 제한이 없음 2) 타입이 자유로움 3) 삭제 가능 4) 사이에 추가 가능  
		ArrayList list = new ArrayList();
		list.add(new Card("Spade",1)); // Object형변환됨.
		list.add(new Card("Heart",1));
		list.add(new Card("Diamond",1));
		list.add(new Card("Clover",1));
		list.add(new Card("Clover",2));
		list.add(new Card("Clover",3));
		list.add(new Card("Clover",3));
		list.add(new Card("Clover",4));
		list.add(new Card("Clover",5));
		list.add(new Card("Clover",6));
		list.add(new Card("Clover",7));
		list.add(new Card("Clover",8));
		list.add(new Card("Clover",9));
		
		for(int i=0;i<list.size();i++) {
			Card ca = (Card)list.get(i);
			System.out.printf("[%s, %d] \n",ca.kind,ca.number);
		}
		
		
		
		
	}

}

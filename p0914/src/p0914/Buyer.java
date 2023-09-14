package p0914;

import java.util.ArrayList;

public class Buyer {
	
	Buyer(){}
	Buyer(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	String id;
	String name;
	int money=10000000;
	int bonusPoint = 0;
	//Product[] cart = new Product[10];
	
	// 컬렉션 선언
	// 컬렉션 프레임워크 - 서로 다른 타입의 데이터를 담을 수 있음 (배열은 동일한 타입만 가능) 
	// * 매개변수가 object이기 때문 ** 크기 제한 없음 *** 배열의 모든 단점을 보완함
	ArrayList list = new ArrayList(); // ***** ArrayList 암기
	
	
//	int i=0;
	void buy(Product p) { // 다형성 활용
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // ***** ArrayList 암기
//		cart[i] = p; //p를 Product[] 배열에 담음.
//		i++;
	}
	
//	void buy(Tv t) { 
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Computer c) { 
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Audio a) { 
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
//	
//	void buy(Washing w) { 
//		money -= w.price;
//		bonusPoint += w.bonusPoint;
//	}	
	

}

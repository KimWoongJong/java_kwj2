package p0914;

public class J0914_04 {

	public static void main(String[] args) {
		
		
		Buyer b1 = new Buyer("aaa","홍길동");
		System.out.printf("%s 잔액 : %d \n",b1.name,b1.money);
		
		

		b1.buy(new Tv());
		b1.buy(new Tv());
		b1.buy(new Tv());
		
		b1.buy(new Computer());
		b1.buy(new Audio());
		b1.buy(new Washing());
		
		System.out.printf("%s 잔액 : %d \n",b1.name,b1.money);
		
		System.out.println("상품구매 저장크기 : "+b1.list.size()); // ***** ArrayList 암기
//		System.out.println("상품구매 저장크기 : "+b1.cart.length);
		System.out.println("상품구매 목록 : ");
		
		
		if(b1.list.isEmpty()) {
			System.out.println("구매물품이 없습니다!");
		}
		
		int sum = 0;
		for(int i=0;i<b1.list.size();i++) {
			Product p = (Product)b1.list.get(i); // ***** ArrayList 암기
			sum += p.price;
			System.out.println(p);
			
//			b1.list.get(0);
//			System.out.println(b1.list[i].name);
		}
		System.out.printf("총 구매금액 : %,d 원\n",sum);
		
		
		
		
//		Tv t = new Tv();
//		b1.buy(t);
////		System.out.println(t.price);
////		b1.money -= t.price; // b1.money = b1.money - t.price
////		b1.bonusPoint += t.bonusPoint;
//		
//		Tv t2 = new Tv();
//		b1.buy(t2);
////		System.out.println(t.price);
////		b1.money -= t2.price; // b1.money = b1.money - t.price
////		b1.bonusPoint += t2.bonusPoint;
//
//		Tv t3 = new Tv();
//		System.out.println(t.price);
//		b1.money -= t3.price; // b1.money = b1.money - t.price
//		b1.bonusPoint += t3.bonusPoint;
		
		
	}

}

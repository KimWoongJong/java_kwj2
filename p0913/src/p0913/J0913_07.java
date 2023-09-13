package p0913;

public class J0913_07 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		System.out.println("현재 잔액 : "+b1.money);
		Tv t = new Tv();
		System.out.println(t.price);
		b1.buy(t); // TV 구매
		System.out.println("현재 잔액 : "+b1.money);
		
		Computer c = new Computer();
		System.out.println(c.price);
		b1.buy(c); // 컴퓨터 구매
		System.out.println("현재 잔액 : "+b1.money);
		
		b1.buy(new Audio()); // 오디오 구매
		
	}

}

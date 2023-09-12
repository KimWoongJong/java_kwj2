package p0912;

public class J0912_05 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pName = "led55";
		p1.price = 50;
		Product p2 = new Product("led60",100);
//		p2.pName = "led60";
//		p2.price = 100;
		Product p3 = new Product("led70",200);
//		p3.pName = "led70";
//		p3.price = 200;
		Product p4 = new Product("led75");
//		p4.pName = "led75";
//		p4.price = 300;
		Product p5 = new Product();
		p5.pName = "led100";
		p5.price = 400;
		
		System.out.println("p1번호 : "+p1.serialNo);
		System.out.println("p1제품이름 : "+p1.pName);
		System.out.println("p1가격 : "+p1.price);
		System.out.println("p2번호 : "+p2.serialNo);
		System.out.println("p2제품이름 : "+p2.pName);
		System.out.println("p2가격 : "+p2.price);
		System.out.println("p3번호 : "+p3.serialNo);
		System.out.println("p3제품이름 : "+p3.pName);
		System.out.println("p3가격 : "+p3.price);
		System.out.println("p4번호 : "+p4.serialNo);
		System.out.println("p4제품이름 : "+p4.pName);
		System.out.println("p4가격 : "+p4.price);
		System.out.println("p5번호 : "+p5.serialNo);
		System.out.println("p5제품이름 : "+p5.pName);
		System.out.println("p5가격 : "+p5.price);
		
		
		
		
	}//main

}

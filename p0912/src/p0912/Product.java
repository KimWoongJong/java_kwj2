package p0912;

public class Product {
	static int count = 0; // 클래스변수
	int serialNo; // 인스턴스변수
	String pName;
	int price;
	
	{
		count++;
		serialNo = count;
	} // 초기화블록 - 생성자가 실행되기 앞서 실행되어 반복적인 소스를 제거할 수 있음
	
	Product(){ //기본생성자
		
	}
	
	Product(String pName){
		this.pName = pName;
	}
	
	Product(String pName,int price){
		this.pName = pName;
		this.price = price;
	}
	
	
	

}

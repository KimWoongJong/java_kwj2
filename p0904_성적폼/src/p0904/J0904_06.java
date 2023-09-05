package p0904;

public class J0904_06 {

	public static void main(String[] args) {
		// Math.random() 은 0.0 이상 1.0 미만의 난수를 만들어냄
		double temp = Math.random(); // round()-반올림, ceil()-올림, floor()-버림
		// 1부터 10까지 랜덤 정수값
		int num = (int)(Math.random()*10)+1;
		// 1부터 100까지 랜덤 정수값
		int num2 = (int)(Math.random()*100)+1;
		// 0부터 9까지 랜덤 정수값
		int num3 = (int)(Math.random()*10);
		// 1부터 50까지 랜덤 정수값
		int num4 = (int)(Math.random()*10)+1;
		// 1부터 45까지 랜덤 정수값
		int num5 = (int)(Math.random()*45)+1;
		// 0부터 9999까지 랜덤 정수값
		int num6 = (int)(Math.random()*10000);
		// 1부터 20까지
		int num7 = (int)(Math.random()*20)+1;
		
		
		System.out.println("난수값 : "+temp);
		System.out.println("랜덤 정수값 : "+num);
	
	}

}

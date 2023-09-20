package p0920;

public class J0920_08 {

	public static void main(String[] args) {

		String str = "최신뉴스 : 아이폰15는 최신폰입니다. 아이폰15는 애플에서 만들었어요. 아이폰15의 가격은 100만원입니다.";
		int result = -1;
		int count = 0;
		while(true) {
			result = str.indexOf("아이폰15",result+1);
			if(result==-1) break;
			count++;
		}
		System.out.println("개수 : "+count);
		
		
//		String str = "Hello world!! oh!!";
//		int result = str.indexOf("o");
//		int result2 = str.indexOf("o",5);
//		System.out.println(result);
//		System.out.println(result2);
		
	}

}

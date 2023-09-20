package p0920;

import java.util.Scanner;

public class J0920_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = new String("(샌프란시스코=연합뉴스) 김태종 특파원 = 애플의 최신 스마트폰인 아이폰15 판매 우려가 커지는 가운데 사전 주문이 호조세를 보이고 있다는 분석이 나왔다.\r\n"
				+ "\r\n"
				+ "모건스탠리는 18일(현지시간) 보고서에서 아이폰15의 리드타임(주문부터 실제 납품까지 걸리는 시간)과 사전 예약 판매가 \"우려했던 것보다 낫다\"고 밝혔다.\r\n"
				+ "\r\n"
				+ "지난 12일 공개된 아이폰15 시리즈는 15일부터 사전 주문에 들어갔다."
				+ "모건스탠리는 아이폰15 프로 맥스의 리드타임은 평균 5∼6주 정도로 \"지난 7년 동안 출시된 모델 중 가장 길다\"고 썼다."
				+ " 프로 맥스는 아이폰 시리즈 가운데 애플이 주력하고 있는 최상위 모델이다."
				);
		
		while(true) {
			System.out.println(str);
			System.out.println("--------------");
			System.out.println("찾고자 하는 글자를 입력하세요.");
			String search = scan.next();
			
			if(search.equals("0")) {
				System.out.println("[ 프로그램 종료 ]");
				break;
			}
			
			String[] s = str.split(" ");
			int count = 0;
			for(int i=0;i<s.length;i++) {
				int n = s[i].indexOf(search);
				if(n!=-1) count++;
			}
			System.out.println("개수 : "+count);
		}
		
		
		
		// 특정 문자를 찾아서 다른 문자로 변경 - replace
//		System.out.println(str);
//		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
//		String str3 = str.replace(" ","");
//		System.out.println(str3);
//		
//		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
//		int count = 0;
		
//		System.out.println("단어 개수가 궁금한 단어를 입력하시오.");
//		String wd = scan.next();
//		int no = wd.length();
//
//		System.out.println(str3.length());
//		int idx3 = str3.indexOf(wd);
//		System.out.println(idx3);
//		System.out.println("**********************************");
//		String str4 = str3.substring(idx3+no);
//		System.out.println(str4);
//		System.out.println(str4.length());
//		int idx4 = str4.indexOf(wd);
//		System.out.println(idx4);
//		System.out.println("**********************************");
//		String str5 = str4.substring(idx4+no);
//		System.out.println(str5);
//		System.out.println(str5.length());
//		int idx5 = str5.indexOf(wd);
//		System.out.println(idx5);
//		System.out.println("**********************************");
//		String str6 = str5.substring(idx5+no);
//		System.out.println(str6);
//		System.out.println(str6.length());
//		int idx6 = str6.indexOf(wd);
//		System.out.println(idx6);
//		System.out.println("**********************************");
//		String str7 = str6.substring(idx6+no);
//		System.out.println(str7);
//		System.out.println(str7.length());
//		int idx7 = str7.indexOf(wd);
//		System.out.println(idx7);
//		System.out.println("**********************************");
		
		
		
		
//		for(int i=0;i<str.length();i++) {
//			if(i<str.length()) {
//				idx = str.indexOf("아이폰15");
//				count++;
//			}else {
//				break;
//			}
//			
//		}
		
//		System.out.println(count);
		
	}//main

}//class

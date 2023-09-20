package p0920;

import java.util.Scanner;

public class J0920_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String input = scan.next();
		
		//주민번호 880101-1101111 2023-1988 = 35 20년생 - 1920년생, 2020년생
		// 1,2 - 1900년대생 3,4 - 2000년대생
		//입력한 주민번호를 확인해서 나이를 출력하시오.
		
//		System.out.println("주민번호를 입력하세요. - 포함해서 입력");
//		String idNo = scan.next();
//		int by=0;
//		String year = "2023";
//		System.out.println(idNo.substring(0,2));
//		
//		System.out.println(idNo.charAt(7));
//		
//		if(idNo.charAt(7)==1 || idNo.charAt(7)==2){
//			by = Integer.parseInt(idNo.substring(0,2))+1900;
//			System.out.println(by);
//		}//else {
////			by = Integer.parseInt(idNo.substring(0,2))+2000;
////			System.out.println(by);
////		}
//		
//		int age = Integer.parseInt(year)-by;
//		System.out.println("당신의 나이 : "+age);
		
		
		// 1. 나이게산
		char ch = input.charAt(7);
		String str = input.substring(0,2);
		
		String year = "";
		int age = 0;
		if(ch=='1' || ch=='2') {
			year = "19"+str; //년도
			age = 2023 - Integer.parseInt(year);
		}else {
			year = "20"+str; //년도
			age = 2023 - Integer.parseInt(year);
		}
		
		System.out.println("당신의 나이 : "+age);
		
		// 2. 계절확인 12,1,2-겨울 3,4,5-봄 6,7,8-여름 9,10,11-가을
		// 당신이 태어난 계절 : 가을
		
		String s = input.substring(2,4);
		String season="";
		switch(s) {
		
		case "12": case "01": case "02":
			season = "겨울";
			break;
			
		
		case "03": case "04": case "05":
			season = "봄";
			break;
			
		case "06": case "07": case "08":
			season = "여름";
			break;
			
		case "09": case "10": case "11":
			season = "가을";
			break;
			
		}//switch
		
		System.out.println("당신이 태어난 계절 : "+season);
		
	}//main

}//class

package p0920;

public class J0920_10 {

	public static void main(String[] args) {
		
		String str = "swim,golf,book,run,game";
		String[] hobby = str.split(",");
		for(String h1:hobby) {
			System.out.print(h1+" ");
		}
		System.out.println();
			
		String str2 = "수영/골프/독서/조깅/게임";
		String[] hobby2 = str2.split("/");
		for(String h2:hobby2) {
			System.out.print(h2+" ");
		}
		System.out.println();
		
		String str3 = "수영 골프 독서 조깅 게임";
		String[] hobby3 = str3.split(" ");
		for(String h3:hobby3) {
			System.out.print(h3+" ");
		}
		System.out.println();
		
		String str4 = "자바-파이썬-C-자바스크립트-리엑트";
		String[] hobby4 = str4.split("-");
		for(String h4:hobby4) {
			System.out.print(h4+" ");
		}
		System.out.println();
		
	}//main

}//class

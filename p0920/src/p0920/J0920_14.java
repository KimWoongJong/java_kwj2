package p0920;

public class J0920_14 {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		// 반대로 출력해 보세요.
		System.out.println("제대로 출력 : "+str);
		System.out.println("길이 : "+str.length()); //26
		System.out.println("반대로 출력 : "+str.charAt(25));
		System.out.println("반대로 출력 : "+str.charAt(str.length()-1));
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("-------------------------------");
		//StringBuffer reverse()
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		
		// 내가 하던 방법 - 마무리 해볼 것
//		String[] str2 = new String[str.length()];
//		for(int i=0;i<str.length();i++) {
//			str2[i] = str.charAt(str.length()-i);
//		}
		
		
		// 반드시 외워야 할 것!!!!!!!!!!! 
		// charAt, contains, equals, indexOf, length, replace, split, substring, trim, (toLowerCase, toUpperCase), Integer.parseInt, Double.parseDouble 
		
		
	}//main

}//class

package p0922;

public class J0922_02 {

	public static void main(String[] args) {

		Week w = Week.FRIDAY; //객체선언 <- enum 지정한 형태대로 값을 받아야 할 때 사용
		String w2 = "FRIDAY";
		
		String weekName = w.name(); //w참조변수 데이터 이름을 가져옴
		System.out.println(weekName);
		System.out.println(w.name());
		System.out.println(w2);
		
		
//		String[] kind = {"Heart","HEART","heart","hEart"};
//		for(int i=0;i<kind.length;i++) {
//			if(kind[i].equals("Heart")) {
//				System.out.println("♥");
//			}//if
//			
//		}//for
		
	}//main

}//class

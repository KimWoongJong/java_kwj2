package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class J0922_03 {

	public static void main(String[] args) {
		
		int n1 = 1000;
		int n2 = 125;
		int a = 1;
		
//		String color = "white";
//		int door = 5;
		
		String[] color = {"white","red","blue"};
		int[] door = {5,4,5};
		
		String[] name = {"홍길동","유관순","이순신"};
		int[] kor = {100,90,80};
		int[] eng = {90,80,70};
		int[] math = {80,70,60};
		
		JAction j = new JAction();// 객체선언

		// 매개변수 6개 -> 리턴 map타입 받음
		HashMap<String, Object> map = j.cal(color, door, name, kor, eng, math);
		
		ArrayList<Car> list = (ArrayList<Car>) map.get("list");
		ArrayList<StuScore> list2 = (ArrayList<StuScore>) map.get("list2");
		
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i).getColor()+", ");
			System.out.println(list.get(i).getDoor());
		}
		
		for(int i=0;i<list2.size();i++) {
			StuScore s = list2.get(i);
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d \n",
					s.getStuNum(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		
		
		
		
		
		
		// 매개변수 2개 -> 리턴 list타입 받음
//		ArrayList<Car> list = j.cal(color, door);
//		
//		for(int i=0;i<list.size();i++) {
//			Car c = list.get(i);
//			System.out.printf("%s, %d\n",c.getColor(),c.getDoor());
//			//System.out.printf("%s, %d\n",list.get(i).getColor(),list.get(i).getDoor());
//		}
		
		
		
		// n1,n2를 JAction cal()로 보내서
		// 곱한 결과값을 리턴해서 출력

		// 매개변수 2개 -> 리턴 객체타입 받음
//		Car c = j.cal(color, door);
//		// c color, door 출력
//		System.out.printf("%s,%d \n",c.getColor(),c.getDoor());

		
		
		//매개변수 2개 -> 리턴 배열타입 받음
//		int[] result = j.cal(n1, n2);
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
		
		//매개변수 2개 -> 리턴 int 타입 받음
//		int result = j.cal(n1,n2); // 매개변수로 값을 넘겨줄 수 있음
//		System.out.println("결과값 : "+result);
		
		
		
	}

}

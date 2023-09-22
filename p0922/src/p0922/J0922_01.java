package p0922;

import java.util.ArrayList;

public class J0922_01 {

	public static void main(String[] args) {
		ArrayList<StuScore> list = new ArrayList(); //ArrayList는 컬렉션 프레임웍이고 <> 지네릭스 
		//ArrayList<StuScore> list2 = new ArrayList<StuScore>(); // 뒤에도 넣어도 되지만 생략 가능
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		list.add(new StuScore("홍길동",100,100,99));
		list.add(new StuScore("유관순",90,90,91));
		list.add(new StuScore("이순신",88,83,80));
		//list.add(new Car("white",5));
		list.add(new StuScore("강감찬",98,93,90));
		list.add(new StuScore("김구",100,83,80));
		
		System.out.println("[성적처리 프로그램]");
		System.out.println("------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		
		
		//출력 - 번호,이름,국어,영어,수학,합계,평균,등수
		for(int i=0;i<list.size();i++) {
			StuScore ss = list.get(i); // <> 지네릭스를 하면 형변환을 할 필요없음, 지네릭스를 안 하면 형변환 필요
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t\n",
					ss.getStuNum(),ss.getName(),ss.getKor(),ss.getEng(),
					ss.getMath(),ss.getTotal(),ss.getAvg(),ss.getRank());
			
		}//for
		
	}//main

}//class

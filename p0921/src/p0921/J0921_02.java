package p0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class J0921_02 {

	public static void main(String[] args) throws Exception {
		// 학번,이름,국어,영어,수학 점수를 입력받아, 파일에 저장하시오.
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> list = new ArrayList();
		
		while(true) {
			
			System.out.println("학번을 입력하세요.(종료하려면 0번 입력)");
			int stuNum = scan.nextInt();
			if(stuNum==0) {
				System.out.println("[ 프로그램 종료 ]");;
				break;
			}
			
			System.out.println("이름을 입력하세요.");
			String name = scan.next();
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			int total = kor+eng+math;
			double avg = total/3.0;
			int rank=0;
			
			// 객체 담으려면
			StuScore s1 = new StuScore(stuNum,name,kor,eng,math);
			
			// 객체생성해서 list에 담기(컬렉션 플레임웍)
			list.add(new StuScore(stuNum,name,kor,eng,math));
			
			
			// 입력한 데이터를 문자열로 변경
			String data = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", // 띄어쓰기 하면 안됨, 하게되면 문자로 인식함(형변환 시)
					stuNum,name,kor,eng,math,total,avg,rank);
			
			
			// 파일에 저장
			FileWriter fw = new FileWriter("c:/aaa/stu1.txt",true);// true - 이어쓰기, false - 덮어쓰기
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			
			System.out.println("입력한 테이터를 출력하였습니다.");
			System.out.println();
		
		}//while
		
		//String[] arrData = data.split(",");
		
	}//main

}//class

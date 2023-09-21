package p0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class J0921_03 {

	public static void main(String[] args) throws Exception {
		// 국어,영어,수학 StuScore객체에 담아 ArrayList에 저장하시오.
		// 파일 stu2.txt 저장
		
		String name = "몰라";
		int stuNum = 1;
		int kor = 50;
		int eng = 70;
		int math = 80;
		int total = kor+eng+math;
		double avg = total/3.0;
		int rank = 1;
		
		ArrayList<StuScore> list = new ArrayList();
		
		StuScore s1 = new StuScore(stuNum,name,kor,eng,math);
		list.add(s1);
		
		String data = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d",
				stuNum,name,kor,eng,math,total,avg,rank);
		
		
		FileWriter fw = new FileWriter("c:/aaa/stu2.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(data);
		bw.close();
		
		

	}

}

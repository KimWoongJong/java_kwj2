package p0920;

public class J0920_09 {

	public static void main(String[] args) {
		String str = "1,홍길동,100,100,100,300,100.0,1";
		String[] grade = str.split(",");
		for(int i=0;i<grade.length;i++) {
			System.out.print(grade[i]+"\t");
		}
		System.out.println();
		System.out.println();
		
		
		int stuNum = Integer.parseInt(grade[0]);
		String name = grade[1];
		int kor = Integer.parseInt(grade[2]);
		int eng = Integer.parseInt(grade[3]);
		int math = Integer.parseInt(grade[4]);
		int total = Integer.parseInt(grade[5]);
		double avg = Double.parseDouble(grade[6]);
		int rank = Integer.parseInt(grade[7]);
		
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("-----------------------------------------------");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
				stuNum, name, kor, eng, math, total, avg, rank);
		
		
		
		
		
		
	}//main

}//class

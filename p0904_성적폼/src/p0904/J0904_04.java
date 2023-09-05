package p0904;

import java.util.Scanner;

public class J0904_04 {

	public static void main(String[] args) {
		// 90점 이상 A, 80점 이상 B, 70점 C, 60점 D, Fㅏ
		// 점수를 입력받아 성적을 출력하시오.
		// 98점 이상 A+, 93점 이하 A-
		Scanner scan = new Scanner(System.in);
		String grade="";
		System.out.println("점수를 입력하시오.");
		int score = scan.nextInt();		
		if(score>=90) {
			//System.out.print("A");
			grade = "A";
			if(score>=98) {
				//System.out.println("+");
				grade = grade + "+";
			}else if(score<=93) {
				//System.out.println("-");
				grade = grade + "-";
			}else {
				System.out.println();
			}
		}else if(score>=80) {
			//System.out.print("B");
			grade = "B";
			if(score>=88) {
				//System.out.println("+");
				grade = grade + "+";
			}else if(score<=83) {
				//System.out.println("-");
				grade = grade + "-";
			}else {
				System.out.println();
			}
		}else if(score>=70) {
			//System.out.print("C");
			grade = "C";
			if(score>=78) {
				//System.out.println("+");
				grade = grade + "+";
			}else if(score<=73) {
				//System.out.println("-");
				grade = grade + "-";
			}else {
				System.out.println();
			}
		}else if(score>=60) {
			//System.out.print("D");
			grade = "D";
			if(score>=68) {
				//System.out.println("+");
				grade = grade + "+";
			}else if(score<=63) {
				//System.out.println("-");
				grade = grade + "-";
			}else {
				System.out.println();
			}
		}else {
			//System.out.println("F");
			grade = "F";
		}
		
		System.out.println("학점 : "+grade);
		System.out.println("점수 : "+score);
		
	}//main

}//class

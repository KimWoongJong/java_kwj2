package p0915_test;

public class JMethod {
	
	JMethod(){} //생성자 - 객체선언할 때에만 사용됨. 호출되어 사용되는 경우 없음. 호출하여 사용하고 싶은 경우에는 메소드를 만들어야 함.
	
	//인스턴스메소드
	int calculate(int n1, int n2) { // main 메소드에서 사용한 변수명과 동일하게 해주는 것을 추천
		//입력받은 2개의 숫자를 4칙연산
		int result = n1+n2;
		int result2 = n1-n2;
		int result3 = n1*n2;
		int result4 = n1/n2;
		
		return result+result2+result3+result4;
	}
	
	int cal2(int a, int b, int c, int d) {
		int result = a+b+c+d;
		int result2 = a*b*c*d;
		
		return result+result2;
	}
	
	int cal2(int[] n) {
		int result = n[0]+n[1]+n[2]+n[3];
		int result2 = n[0]*n[1]*n[2]*n[3];
		
		return result+result2;
	}
	
	
	
}

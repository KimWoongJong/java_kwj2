package p0906;

public class J0906_01 {

	public static void main(String[] args) {
		int[] num = new int[50];
		int[] random = new int[6];
		
//		random[0] = (int)(Math.random()*45);
//		random[1] = (int)(Math.random()*45);
//		random[2] = (int)(Math.random()*45);
//		random[3] = (int)(Math.random()*45);
//		random[4] = (int)(Math.random()*45);
//		random[5] = (int)(Math.random()*45);
		
		for(int i=0;i<6;i++) {
			random[i] = (int)(Math.random()*45);
		}
		
		for(int i=0;i<num.length;i++) { //num[0], num[1], ... , num[44]
			num[i] = i+1;
		}
		
		int n=0;
		for(int i=0;i<random.length;i++) {
			n = random[i];
			System.out.println("랜덤 뽑기 : "+num[n]);
			
		}
		
		//System.out.println("랜덤 뽑기 : "+num[random]);
		
		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
	}//main

}//class

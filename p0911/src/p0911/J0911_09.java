package p0911;

public class J0911_09 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		System.out.println(d);
		change(d);
		System.out.println("2번째 d.x : "+d.x);

	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change x : "+d.x);
		
	}
	
}

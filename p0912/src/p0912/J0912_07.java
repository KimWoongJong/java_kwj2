package p0912;

public class J0912_07 {

	public static void main(String[] args) {
		Circle c1 = new Circle(); // (0,0),100,"원형
		// (150,150),50,"원형"
		Point point = new Point(100,50);
		c1.draw();
		
		Circle c2 = new Circle(point,30,"원형");
		c2.draw();
//		Circle c2 = new Circle(new Point(150,150),50,"원형");
		
		Point[] p = {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)				
		}; // 점을 3개 가지고 있는 배열
		
		Triangle t1 = new Triangle(p,"삼각형"); // 배열로 한 번에 보내는 생성자
		t1.draw();
		
		
		Triangle t2 = new Triangle( // 각각의 점을 입력해서 보내는 방법
				new Point(10,10),
				new Point(20,20),
				new Point(100,100),"삼각형");
		t2.draw();
		
		
	}

}

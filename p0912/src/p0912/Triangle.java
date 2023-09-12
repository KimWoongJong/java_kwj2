package p0912;

public class Triangle extends Shape {
	Point[] p;
	
	Triangle(){}
	
	Triangle(Point[] p, String typeName){
		this.p = p;
		this.typeName = "삼각형";
	}
	
	Triangle(Point p1, Point p2, Point p3, String typeName){
		p = new Point[] {p1,p2,p3};
		//p = {p1,p2,p3}; // 사용불가
		this.typeName = "삼각형";
		
	}
	
}

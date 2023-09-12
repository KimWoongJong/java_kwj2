package p0912;

public class Circle extends Shape {
	Point center;
	int r;
	
	Circle(){
		this(new Point(0,0),100,"원형");
	}
	
	Circle(Point center, int r, String typeName){
		this.center = center;
		this.r = r;
		this.typeName = typeName;
	}

}

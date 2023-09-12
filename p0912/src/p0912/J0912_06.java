package p0912;

public class J0912_06 {

	public static void main(String[] args) {
		Point p = new Point();
		p.x = 10;
		p.y = 5;
		System.out.printf("[%d,%d] \n",p.x,p.y);
		
		Point3d pp = new Point3d();
		pp.x = 7;
		pp.y = 2;
		pp.z = 10;
		System.out.printf("[%d,%d,%d] \n",pp.x,pp.y,pp.z);
	}

}

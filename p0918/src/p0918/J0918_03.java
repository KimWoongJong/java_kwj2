package p0918;

public class J0918_03 {
	
	public static void main(String[] args) {
		Tank t = new Tank();
		System.out.println("탱크 폭탄 맞음");
		t.hitPoint -= 10;//
		System.out.println("탱크 폭탄 맞음");
		t.hitPoint -= 10;//
		System.out.println("총알 맞음");
		t.hitPoint -= 2;//
		System.out.println("탱크의 체력 : "+t.hitPoint);
		Scv s = new Scv(); //SCV 1
		Marine m = new Marine(); // Marine 1
		s.repair(t); // 탱크수리
		System.out.println("탱크의 체력 : "+t.hitPoint);
		DropShip d = new DropShip(); // DropShip 1
		System.out.println("DropShip 총알 맞음");
		d.hitPoint -= 20;
		System.out.println("DropShip 체력 : "+d.hitPoint);
		s.repair(d); // 수송선수리
		System.out.println("Marine 총알 맞음");
		m.hitPoint -= 30;
		System.out.println("Marine 체력 : "+m.hitPoint);
		// s.repair(m); // 마린수리
		// System.out.println("Marine 체력 : "+m.hitPoint);
		
	}

}

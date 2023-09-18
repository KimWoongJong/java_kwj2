package p0918;

public class DropShip extends AirUnit implements Repairable {

	public DropShip() {
		super(120);
		hitPoint = MAX_HP;
		name="DropShip";
	}
	
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",name,x,y);

	}

}

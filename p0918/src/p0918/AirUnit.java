package p0918;

public class AirUnit extends Unit {
	
	AirUnit(int hp) {
		super(hp);
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",name,x,y);

	}

}

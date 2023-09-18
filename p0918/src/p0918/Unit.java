package p0918;

public abstract class Unit {
	int x, y;
	String name;
	int hitPoint; //체력
	final int MAX_HP; //최대체력
	
	Unit(int hp){
		MAX_HP = hp;
	}
	
	abstract void move(int x, int y);
	void stop() {
		System.out.println("정지합니다.");
		
	};

}
